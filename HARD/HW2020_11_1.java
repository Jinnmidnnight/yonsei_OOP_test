package HARD;
import java.util.Scanner;

public class HW2020_11_1 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        int[] nArray = new int[10];
        int j = 0;
        int i = 0;

        while (!done) {
            int n = keyboard.nextInt();
            if (n == -1){
                nArray[j] = n;
                done = true;
            }
            else {
                nArray[j] = n;
                j++;
            }
        }
        System.out.println(sum(nArray, i));
    }

    static int sum(int[] nArray, int i) {
        if (nArray[i] == -1) {
            return 0;
        }
        int sum = nArray[i] + sum(nArray, i+1);
        return sum;
    }
}
