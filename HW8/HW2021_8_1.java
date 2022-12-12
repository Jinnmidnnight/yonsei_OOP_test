package HW8;
public class HW2021_8_1 {

	public static void main(String[] args) {
		People p1, p2, p3; 
		
		p1 = new Asian();
		p2 = new European(); 
		p3 = new African(); 
		
		introduceMe(p1);
		introduceMe(p2);
		introduceMe(p3);
	}
	
	static void introduceMe(People p) {
		p.introduce(); 
	}

}

abstract class People {
	String p;

    abstract void introduce();
}

class Asian extends People {
	public Asian() { p = "Asian";}
	public void introduce() {System.out.println("I'm an "+p);}
}

class European extends People {
	public European() {p="European";}
	public void introduce() {System.out.println("I'm an "+p);}
}

class African extends People {
	public African() {p="African";}
	public void introduce() {System.out.println("I'm an "+p);}
}
