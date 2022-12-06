package HW13;
public class HW2020_13_1 {
	public static void main(String[] args) {
		AirCon131 aircon = new AirCon131("LLAir", 90, false); 
		TV131 tv = new TV131("SSTV", 130, 10); 
		
		System.out.println(aircon); 
		aircon.repair();  
		System.out.println(tv); 
		tv.sound();
		tv.repair(); 
	}
}

interface Soundable131 {
    int MAX_VOLUME = 100;
    void sound();
}

interface Repairable131 {
    void repair();
}

abstract class Product131 {
    private String name; private int cost;

    public abstract String toString();
    public Product131(String name, int cost) {
        this.name = name; this.cost = cost;
    }
    public String getName() {return name;}
    public int getCost() {return cost;}
}

class AirCon131 extends Product131 implements Repairable131 {
    private boolean combineHeatingCooling;

    public AirCon131(String name, int cost, boolean combineHeatingCooling) {
        super(name, cost);
        this.combineHeatingCooling = combineHeatingCooling;
    }
    public String toString() {
        return "name("+getName()+") cost("+getCost()+") combined("+combineHeatingCooling+")";
    }
    public void repair() {
        System.out.println("AirCon repaired");
    }
}

class TV131 extends Product131 implements Soundable131, Repairable131 {
    private int nChannel;

    public TV131(String name, int cost, int nChannel) {
        super(name, cost);
        this.nChannel = nChannel;
    }
    public String toString() {
        return "name("+getName()+") cost("+getCost()+") nChannel("+nChannel+")";
    }
    public void sound() {
        System.out.println("TV sound with max volume: "+MAX_VOLUME);
    }
    public void repair() {
        System.out.println("TV repaired");
    }

}