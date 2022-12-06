package HW5;
import java.util.Scanner;

public class HW2020_5_1 {
    public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int x = keyboard.nextInt();
		int y = keyboard.nextInt(); 
		int z = keyboard.nextInt(); 
		
        doubleInteger newX = new doubleInteger(x);
        doubleInteger newY = new doubleInteger(y);
        doubleInteger newZ = new doubleInteger(z);

        doubleNumber(newX, newY, newZ);
	
	}
	
	static void doubleNumber(int x, int y, int z)
	{
		x = 2 * x; 
		y = 2 * y; 
		z = 2 * z; 
	}

    static void doubleNumber(doubleInteger x, doubleInteger y, doubleInteger z) {
        int X = x.getNum() * 2;
        int Y = y.getNum() * 2;
        int Z = z.getNum() * 2;
        System.out.println(X + " " + Y + " " + Z);
    }

}

class doubleInteger {
    private int num;

    public int getNum() {return num;};
    public doubleInteger(int num) {this.num = num;};
    public doubleInteger() {};
}
