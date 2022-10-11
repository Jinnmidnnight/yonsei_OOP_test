public class HW2020_1_2 {
    public static void main (String[] args) {
        int coupon = 37;
        int candy = coupon / COUPON_CANDY;
        int gum = (coupon - candy * COUPON_CANDY) / COUPON_GUM;
        System.out.println(candy + " " + gum);
    }

    public static final int COUPON_CANDY = 10;
    public static final int COUPON_GUM = 3;

}
