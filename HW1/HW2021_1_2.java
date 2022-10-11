package HW1;
public class HW2021_1_2 {
    public static void main (String[] args) {
        int total = 38;
        int num = total / (BOARDING_LIMIT - 1) + 1;
        System.out.println("Number of Round Trips = " + num);

    }

    public static final int BOARDING_LIMIT = 5;
}
