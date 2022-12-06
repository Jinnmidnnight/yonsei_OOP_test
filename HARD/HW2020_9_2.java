package HARD;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW2020_9_2 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean done = false;
        do {
            try {
                int input = keyboard.nextInt();
                if (input < 0 || input >= 10) {
                    throw new RangeException();
                }
                System.out.println("n = "+input);
                done = true;
            }
            catch (InputMismatchException e1) {
                System.out.println("Type error. Try again.");
                keyboard.nextLine();
            }
            catch (RangeException e2) {
                System.out.println(e2);
            }
        }
        while (!done);
    }
}

class RangeException extends Exception {
    public String toString() {
        return "Range error. Try again.";
    }
}