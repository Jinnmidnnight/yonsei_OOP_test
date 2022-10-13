package HW3;
import java.util.Scanner;

public class HW2020_3_3 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        String input_str = Integer.toString(input);

        int total = 0;
        for (int i=0; i< input_str.length();i++) {
            total += Integer.parseInt(input_str.substring(i,i+1));
        }
        System.out.println(total);
    }
}
