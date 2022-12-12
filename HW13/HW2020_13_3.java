package HW13;
public class HW2020_13_3 {
	public static void main(String[] args) {
	
        Product133 p1 = new Product133(100) {
            public void setSellCost() {
                setCost(2);
            }
        };

        Product133 p2 = new Product133(200) {
            public void setSellCost() {
                setCost(3);
            }
        };
		
		System.out.println(p1); 
		System.out.println(p2); 
		p1.setSellCost(); 
		p2.setSellCost(); 
		System.out.println(p1); 
		System.out.println(p2); 
	}
}

interface Sellable {
	void setSellCost(); 
}

abstract class Product133 implements Sellable {
	private int cost; 
	
	public Product133(int cost) {
		this.cost = cost; 
	}
	
	abstract public void setSellCost(); 
	
	public int getCost() {
		return cost; 
	}
	
	public void setCost(int times) {
		cost = cost * times; 
	}
	
	public String toString() {
		return "PRODUCT " + cost; 
	}
}
