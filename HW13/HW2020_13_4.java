package HW13;
public class HW2020_13_4 {
	public static void main(String[] args) {
		Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.method1();
	}
}

class Outer {
	int value;
    Inner in;
    public Outer() {value = 10;}

	class Inner {
		int value;
        public Inner() {value = 20;}
		void method1() {
			int value = 30;
			System.out.println("value: " + value); 
			System.out.println("this.value: " + this.value); 
			System.out.println("Outer.this.value: " + Outer.this.value);
		}
	}
}
