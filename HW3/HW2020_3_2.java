package HW3;
import java.util.Scanner;

public class HW2020_3_2 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        while (true) {
            double operand1 = keyboard.nextDouble();

            if (operand1 == 0) {
                System.out.println("Bye");
                break;
            }

            String operator = keyboard.next();
            double operand2 = keyboard.nextDouble();
    
            double answer = 0;;
            if (operator.equals("+")) {
                answer = operand1 + operand2;
                System.out.println(answer);

            }
            else if(operator.equals("-")) {
                answer = operand1 - operand2;
                System.out.println(answer);

            }
            else if(operator.equals("*")) {
                answer = operand1 * operand2;
                System.out.println(answer);

            }
            else if(operator.equals("/")) {
                answer = operand1 / operand2;
                System.out.println(answer);

            }


    
        }
    }
}
