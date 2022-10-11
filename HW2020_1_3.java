public class HW2020_1_3 {
    public static void main (String[] args) {
        String str1 = "I hate you.";
        System.out.println(str1);

        String str2 = str1.substring(0 , str1.indexOf("hate"));
        String str3 = str1.substring(str1.indexOf("hate") + 4);

        System.out.println(str2 + "love" + str3);
    }
}
