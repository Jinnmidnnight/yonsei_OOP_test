public class HW2021_1_3 {
    public static void main (String[] args) {
        String strOriginal = "I love you.";
        System.out.println("string = [" + strOriginal + "]");
        System.out.println("string length = " + strOriginal.length());
        System.out.println("Is the string the same as \"I Love YOU.\"? " + strOriginal.equals("I Love YOU."));
        System.out.println("Is the string the same as \"I Love YOU.\"? " + strOriginal.equalsIgnoreCase("I Love YOU."));
        System.out.println("string to lowercase = [" + strOriginal.toLowerCase() + "]");
        System.out.println("string to uppercase = [" + strOriginal.toUpperCase() + "]");

        String str2 = "   " + strOriginal + "   ";
        System.out.println("add three white spaces before and after the string = [" + str2 + "]");
        System.out.println("trim the leading and trailing white spaces = [" + str2.trim() + "]");
        System.out.println("character at position 7 = " + strOriginal.charAt(7));
        System.out.println("substring starting from position 5 = [" + strOriginal.substring(5) + "]");
        System.out.println("starting index of the substring \"ov\" = " + strOriginal.indexOf("ov"));
        System.out.println("comparison to \"I love you.\" = " + strOriginal.compareTo("I love you."));
    }
}
