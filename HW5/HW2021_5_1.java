package HW5;

public class HW2021_5_1 {
	public static void main(String[] args) {
		System.out.println(Class51.howMany()); 
		Class51 a = new Class51();
		Class51 b = new Class51(5); 
		System.out.println(b.howMany()); 
		Class51 c = new Class51(10); 
		System.out.println(Class51.howMany());
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

class Class51 {
    private int x;
    private static int num;

    public static int howMany() {
        return num;
    }
    public Class51() {num++;};
    public Class51(int x) {
        num++;
        this.x = x + num;
    }
	public String toString() {
		return Integer.toString(x);
	}

}

