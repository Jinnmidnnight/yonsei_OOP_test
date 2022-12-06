package HW8;
public class HW2020_8_3 {

	public static void main(String[] args) {
		Class83_1 c1, c2, c3; 
		
        c1 = new Class83_1();
        c2 = new Class83_2();
        c3 = new Class83_3();
		
		System.out.println(c1); 
		System.out.println(c2); 
		System.out.println(c3); 

	}

}

class Class83_1 {
	static final int x = 100;
	public String toString() { 
		return "ONE " + x; 
	} 
}

class Class83_2 extends Class83_1 {
	static final int x = 200;
	public String toString() { 
		return "TWO " + x; 
	} 
}

class Class83_3 extends Class83_1 {
	static final int x = 300;
	public String toString() { 
		return "THREE " + x; 
	} 
}

