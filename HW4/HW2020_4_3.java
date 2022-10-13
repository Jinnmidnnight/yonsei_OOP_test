package HW4;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HW2020_4_3 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String user1 = keyboard.nextLine();
        String user2 = keyboard.nextLine();
        String user3 = keyboard.nextLine();

        StringTokenizer user1Token = new StringTokenizer(user1, " /");
        StringTokenizer user2Token = new StringTokenizer(user2, " /");
        StringTokenizer user3Token = new StringTokenizer(user3, " /");

        String user1_p1 = user1Token.nextToken();
        String user1_p2 = user1Token.nextToken();
        String user1_p3 = user1Token.nextToken();
        
        String user2_p1 = user2Token.nextToken();
        String user2_p2 = user2Token.nextToken();
        String user2_p3 = user2Token.nextToken();

        String user3_p1 = user3Token.nextToken();
        String user3_p2 = user3Token.nextToken();
        String user3_p3 = user3Token.nextToken();

        int total_p1 = Integer.parseInt(user1_p1) + Integer.parseInt(user2_p1) + Integer.parseInt(user3_p1);
        double num_p1 = 0;
        if (Integer.parseInt(user1_p1) != 0){
            num_p1++;
        }
        if (Integer.parseInt(user2_p1) != 0){
            num_p1++;
        }
        if (Integer.parseInt(user3_p1) != 0){
            num_p1++;
        }

        int total_p2 = Integer.parseInt(user1_p2) + Integer.parseInt(user2_p2) + Integer.parseInt(user3_p2);
        double num_p2 = 0;
        if (Integer.parseInt(user1_p2) != 0){
            num_p2++;
        }
        if (Integer.parseInt(user2_p2) != 0){
            num_p2++;
        }
        if (Integer.parseInt(user3_p2) != 0){
            num_p2++;
        }


        int total_p3 = Integer.parseInt(user1_p3) + Integer.parseInt(user2_p3) + Integer.parseInt(user3_p3);
        double num_p3 = 0;
        if (Integer.parseInt(user1_p3) != 0){
            num_p3++;
        }
        if (Integer.parseInt(user2_p3) != 0){
            num_p3++;
        }
        if (Integer.parseInt(user3_p3) != 0){
            num_p3++;
        }

        double avg1 = 0;
        if (num_p1 != 0) {
            avg1 = total_p1 / num_p1;
        }
        else {
            avg1 = 0;
        }
        double avg2 = 0;
        if (num_p2 != 0) {
            avg2 = total_p2 / num_p2;
        }
        else {
            avg2 = 0;
        }

        double avg3 = 0;
        if (num_p3 != 0) {
            avg3 = total_p3 / num_p3;
        }
        else {
            avg3 = 0;
        }


        System.out.println(avg1 + " " + avg2 + " " + avg3);
    }
}