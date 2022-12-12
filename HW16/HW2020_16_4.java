package HW16;
import java.util.Queue; 
import java.util.LinkedList; 

public class HW2020_16_4 {

	public static void main(String[] args) {
		String[] str = {"abcdefabcdef", 
						"1234512345", 
						"123452345",
						"abccba", 
						"abcba",
						"11", 
						"1",
						"", 
						"a bc d  a bc d  "}; 
		
		for (int i = 0; i < str.length; i++) {
			System.out.println("\"" + str[i] + "\" " + check(str[i]));
		}
	}
	
	static boolean check(String str) {
        Queue<Character> q = new LinkedList<Character>();

        if (str.length() % 2 == 1) return false;
        for (int i=0; i<(str.length()/2);i++) {
            q.offer(str.charAt(i));
        }
        for (int i=(str.length()/2); i<str.length(); i++) {
            if (q.poll() != str.charAt(i)) {
                return false;
            }
        }
        if (!q.isEmpty()) {return false;}
        return true;
    }
}
