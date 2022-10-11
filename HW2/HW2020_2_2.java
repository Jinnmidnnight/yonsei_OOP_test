package HW2;
import java.util.Scanner;

public class HW2020_2_2 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String first = keyboard.next();
        String second = keyboard.next();
    
        String new_first = first.substring(1) + first.charAt(0) + "ay";
        String new_second = second.substring(1) + second.charAt(0) + "ay";
        System.out.println(new_first + " " + new_second);
    
    }

}
