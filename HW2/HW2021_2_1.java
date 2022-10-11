package HW2;
import java.util.Scanner;

public class HW2021_2_1 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int money = keyboard.nextInt();
        int five_man = money / 50000;
        int one_man = (money % 50000) / 10000;
        int five_cheon = (money % 50000 % 10000) / 5000;
        int one_cheon = (money % 50000 % 10000 % 5000) / 1000;
        int five_baek = (money % 50000 % 10000 % 5000 % 1000) / 500;
        int one_baek = (money % 50000 % 10000 % 5000 % 1000 % 500) / 100;
        int five_sip = (money % 50000 % 10000 % 5000 % 1000 % 500 % 100) / 50;
        int one_sip = (money % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50) / 10;

        System.out.println(five_man+" "+one_man+" "+five_cheon+" "+one_cheon+" "+five_baek+" "+one_baek+" "+five_sip+" "+one_sip);

    }
}
