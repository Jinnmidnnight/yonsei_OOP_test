package HW14;
public class HW2020_14_4 {

	public static void main(String[] args) {
		
		Parent144<String> parent = new Parent144<String>("SEOUL"); 
		Cat144 c1 = new Cat144("popo", 3); 
		Cat144 c2 = new Cat144("gugu", 2); 
		Child144<Cat144,String> child = new Child144<Cat144,String>(c1,"hello");
		
		System.out.println("parent = " + parent);
		System.out.println("parent.mix(\"korea\") = " + parent.mix("korea")); 
		System.out.println("child = " + child); 
		System.out.println("child.mix(c2) = " + child.mix(c2)); 
		System.out.println("child.mix2(c2,\"korea\") = " + child.mix2(c2,"korea")); 
	}

}

// your code for Mixable144, Parent144, Child144, and Cat144

interface Mixable144<T> { String mix(String s);}

class Parent144<T> implements Mixable144<T> {
    private T str;

    public Parent144(T str) {this.str = str;}
    public String mix(String s) {
        return str + " " + s;
    }
    public String toString() {
        return "" + str;
    }
    public T getStr() {return str;}
}

class Child144<T1, T> extends Parent144<T> {
    private T1 child;

    public Child144(T1 child, T str) {
        super(str); this.child = child;
    }
    public String mix(Cat144 child) {
        return this.child + " "+child;
    }
    public String toString() {
        return child + " " + getStr();
    }
    public String mix2(Cat144 child, String str) {
        return str + " " + toString() + " " + child;
    }
}

class Cat144 {
    private String name; private int age;

    public Cat144(String name, int age) {
        this.name = name; this.age = age;
    }
    public String toString() {
        return "[CAT "+name+" "+age+"]";
    }
}