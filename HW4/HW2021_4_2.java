package HW4;

public class HW2021_4_2 {
    public static void main(String[] args) {
		int a = 3, b = 5; 
		int c = add(a, b); 
		System.out.println(c);
		
		String s1 = "Seoul"; 
		String s2 = add(s1, a); 
		System.out.println(s2); 
		
		String s3 = "Korea"; 
		String s4 = add(s1, s3); 
		System.out.println(s4); 
	}

    static int add(int a, int b) {
        return a + b;
    }
    static String add(String s1, String s2) {
        return s1 + s2;
    }
    static String add(String s1, int a) {
        return s1 + a;
    }
}
