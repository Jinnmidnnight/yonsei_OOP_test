package HW5;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HW2020_5_3 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int count = 0;

        while (true) {
            String input = keyboard.nextLine();
            if (input.equals("0")) {
                System.out.println("Bye " + count);
                break;
            }
            StringTokenizer tk = new StringTokenizer(input);
            int total = 0;
            while (tk.hasMoreTokens()) {
                String x = tk.nextToken();
                total += Integer.parseInt(x);
                System.out.print(x + " ");
            }
            System.out.println(total);
            count++;
        }
    }
}
