package HW11;
public class HW2020_11_2 {

	public static void main(String[] args) {
		System.out.println(isPalindrome("")); 
		System.out.println(isPalindrome("p")); 
		System.out.println(isPalindrome("abc")); 
		System.out.println(isPalindrome("korea")); 
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("wasitacatisaw")); // Was it a cat I saw
	}
	
	static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length()-1)) {
            return false;
        }
        String newS = s.substring(1, s.length()-1);
        return isPalindrome(newS);
    }

}
