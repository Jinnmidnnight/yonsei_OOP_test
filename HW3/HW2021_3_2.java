package HW3;
import java.util.Scanner;

public class HW2021_3_2 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        int index = 2;
        int count = 0;

        while (count < num) {
            boolean flag = true;
            for (int i=2; i<index;i++) {
                if (index % i == 0) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                count++;
                if (count == 1) {
                    System.out.print(index);
                }
                else{
                    System.out.print(" "+index);
                }
            }
            index++;
        }
    }
}
