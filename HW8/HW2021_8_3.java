package HW8;
public class HW2021_8_3 {

	public static void main(String[] args) {
		
			Animal83[] animal = new Animal83[2]; 
			
			animal[0] = new Dog83("Tom", 3, "hunting"); 
			animal[1] = new Cat83("Jerry", 7, "yellow"); 
			printAnimalArray(animal); 
			
	}
		
    static void printAnimalArray(Animal83[] animal) {
			for (int i = 0; i < animal.length; i++) {
				System.out.print("animal[" + i + "] ");
				System.out.print(animal[i]); 
				System.out.println(" sound: " + animal[i].sound()); 
			}
	}
}

abstract class Animal83 { 
	String name; int age;

	abstract String sound();
	public Animal83(String name, int age) {
		this.name = name; this.age = age;
	}
	public String toString() {
		return " name("+name+") age("+age+") ";
	}
}

class Dog83 extends Animal83{
	String specialty;

	public String sound() {
		return "wal-wal";
	}
	public Dog83(String name, int age, String specialty) {
		super(name, age); this.specialty = specialty;
	}
	public String toString() {
		return "[DOG]"+super.toString()+"specialty("+specialty+")";
	}
}

class Cat83 extends Animal83 {
	String color;

	public String sound() {
		return "meow";
	}
	public Cat83(String name, int age, String color) {
		super(name, age); this.color = color;
	}
	public String toString() {
		return "[CAT]"+super.toString()+"color("+color+")";
	}
}