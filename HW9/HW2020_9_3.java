package HW9;
public class HW2020_9_3 {

	public static void main(String[] args) {
		try {
			method1();
            System.out.println(1);
		} 
		catch(Exception e) {
            System.out.println(7);
		} 
	}
	
	static void method1() throws Exception { 
		try {
			method2();
            System.out.println(3);
		} 
		catch(NullPointerException e) {
            System.out.println(2);
			throw e;
		} 
		catch(Exception e) {
            System.out.println(5);
		} 
		finally {
            System.out.println(4);
		}
        System.out.println(6);
	} 
	
	static void method2() throws Exception {
		throw new NullPointerException();
	}
}