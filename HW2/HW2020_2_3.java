package HW2;
import java.util.Scanner;

public class HW2020_2_3 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int quarter = keyboard.nextInt();
        int dime = keyboard.nextInt();
        int nickle = keyboard.nextInt();
        int penny = keyboard.nextInt();

        double dollars = 0.25 * quarter + 0.1 * dime + 0.05 * nickle + 0.01 * penny;
        System.out.printf("%.2f\n",dollars);
    }

}
