package HW8;
public class HW2020_8_1 {

	public static void main(String[] args) {
		Pet81 a1, a2, a3; 
		
		a1 = new Cat81();
        a2 = new Dog81();
        a3 = new Cat81();
		
		makeSomeNoise(a1); 
		makeSomeNoise(a2); 
		makeSomeNoise(a3); 
	}
	
	public static void makeSomeNoise(Pet81 pet) {
        pet.sound();
    }

}

abstract class Pet81 {
	abstract void sound();

}

class Dog81 extends Pet81 {
    public void sound() {
        System.out.println("wal");
    }
}

class Cat81 extends Pet81 {
    public void sound() {
        System.out.println("meow");
    }}