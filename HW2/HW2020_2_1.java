package HW2;
import java.util.Scanner;

public class HW2020_2_1 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int dividend = keyboard.nextInt();
        int divisor = keyboard.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println(dividend + " " + divisor + " " + quotient + " " + remainder);
    }
}
