package HW8;

public class HW2020_8_2 {

	public static void main(String[] args) {
		Product82[] p = new Product82[3]; 
		p[0] = new Product82(30); 
		p[1] = new TV82(90, 10); 
		p[2] = new Computer82(70, 4); 
		
		for (int i = 0; i < p.length; i++) {
			action(p[i]); 
		}
	}
	
	static void action(Product82 p) {
		if (p instanceof TV82) {
            TV82 tv = (TV82) p;
            tv.turnOnTV();
        }
        else if (p instanceof Computer82) {
            Computer82 com = (Computer82) p;
            com.shutDownComputer();
        }
        else {
            p.play();
        }
	}
}

class Product82 {
	protected int price;
	
	public Product82(int price) {
		this.price = price; 
	}
	
	public void play() {
		System.out.println("Play product"); 
	}
}

class TV82 extends Product82 {
	protected int nChannel; 
	
	public TV82(int price, int nChannel) {
		super(price); 
		this.nChannel = nChannel; 
	}
	
	public void turnOnTV() {
		System.out.println("Turn on TV"); 
	}
}

class Computer82 extends Product82 {
	protected int nCPU;
	
	public Computer82(int price, int nCPU) {
		super(price); 
		this.nCPU = nCPU; 
	}
	
	public void shutDownComputer() {
		System.out.println("Shut down computer"); 
	}
}

