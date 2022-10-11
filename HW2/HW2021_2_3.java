package HW2;

import java.util.Scanner;

public class HW2021_2_3 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        String word = keyboard.next();

        String str = input.substring(0, input.indexOf(word)-1) + input.substring(input.indexOf(word)+word.length());

        System.out.println(str);
    }
}
