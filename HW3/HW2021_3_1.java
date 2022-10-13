package HW3;
import java.util.Scanner;

public class HW2021_3_1 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();

        if (num1<1 || num1>=100 || num2 <1 || num2>=100) {
            System.exit(0);
        }

        boolean begin = true;
        for (int i=1; i<=num1;i++) {
            if (num1 % i == 0) {
                if (!begin) {
                    System.out.print(",");
                }
                else {
                    begin = false;
                }
                System.out.print(i);
            }
        }
        System.out.println();

        begin = true;
        for (int i=1; i<=num2;i++) {
            if (num2 % i == 0) {
                if (!begin) {
                    System.out.print(",");
                }
                else {
                    begin = false;
                }
                System.out.print(i);
            }
        }
        System.out.println();

        begin = true;
        int min = (num1 < num2) ? num1:num2;
        for (int i=1; i<=min;i++) {
            if (num1 % i == 0 && num2 % i ==0) {
                if (!begin) {
                    System.out.print(",");
                }
                else {
                    begin = false;
                }
                System.out.print(i);
            }
        }
        System.out.println();

    }
}
