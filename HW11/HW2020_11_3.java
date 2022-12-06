package HW11;
public class HW2020_11_3 {
	
	public static void main(String[] args) {
		System.out.println(fib(1)); 
		System.out.println(fib(2)); 
		System.out.println(fib(3)); 
		System.out.println(fib(20)); 
	}
	
	static int fib(int n) {
        if (n <=2) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

}
