package HW5;

public class HW2020_5_4 {
    	public static void main(String[] args) {
		Dog54 d1 = new Dog54("coco");
		Dog54 d2 = new Dog54("pupu");
		Dog54 d3 = new Dog54(); 
		Person54 p1 = new Person54();
		Person54 p2 = new Person54("Elton", d3); 
		Person54 p3 = new Person54("Mary", d1);
		Person54 p4 = new Person54("Tom", d1); 
		Person54 p5 = new Person54("John", d2); 
		
	    System.out.println("d1: " + d1); 
	    System.out.println("d2: " + d2); 
	    System.out.println("d3: " + d3); 
		
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p3: " + p3);
		System.out.println("p4: " + p4);
		System.out.println("p5: " + p5); 
		System.out.println();
		
		p1.equalize(p2);
		p4.equalize(p5);
		
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p3: " + p3);
		System.out.println("p4: " + p4);
		System.out.println("p5: " + p5); 
		System.out.println();
		
	    System.out.println("p2 equals p1? " + p2.equals(p1));
	    System.out.println("p4 equals p5? " + p4.equals(p5));
	    System.out.println("p4 equals p2? " + p4.equals(p2));
	    System.out.println("p4 == p5? " + (p4 == p2)); 
		System.out.println();
	    
	    d1.setName("xuxu");
	    d2.setName("yuyu");
	    d3.setName("zuzu");
	    
	    System.out.println("d1: " + d1); 
	    System.out.println("d2: " + d2); 
	    System.out.println("d3: " + d3); 
	    
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p3: " + p3);
		System.out.println("p4: " + p4);
		System.out.println("p5: " + p5); 
		System.out.println(); 
	}

}

class Person54 {
    private String name;
    private Dog54 dog;

    public Person54(String name, Dog54 dog) {
        this.name = name;
        this.dog = new Dog54(dog);
    }
    public void equalize(Person54 other) {
        other.name = name;
        if (dog == null) {
            other.dog = null;
        }
        else {
            other.dog = new Dog54(dog);
        }
    }
    public String toString() {
        if (dog == null) {
            return "name("+name+") dog()";
        }
        return "name("+name+") dog("+dog+")";
    }
    public boolean equals(Person54 other) {
        if (name.equals(other.name)) {
            if (dog == null) {
                if (other.dog == null) {
                    return true;
                };
                return false;
            }
            else {
                if (other.dog == null) {
                    return false;
                }
                if (dog.getName().equals(other.dog.getName())) {
                    return true;
                };
                return false;
            }
        }
        return false;
    }
    public Person54() {
        name = "noname";
        dog = null;
    }
}

class Dog54 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public Dog54(String name) {
        this.name = name;
    }
    public Dog54(Dog54 other) {
        name = other.name;
    }
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public Dog54() {
        name = "noname";
    }
}