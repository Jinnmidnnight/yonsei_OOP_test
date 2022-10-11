package HW2;

import java.util.Scanner;

public class HW2021_2_2 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        String nothing = keyboard.nextLine();
        String name = keyboard.nextLine();

        System.out.println("AGE("+age+") NAME("+name+")");
    }
}
