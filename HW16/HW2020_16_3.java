package HW16;
import java.util.Stack; 

public class HW2020_16_3 {

	public static void main(String[] args) {
		String[] str = { "(((aaa)aa((aa))))", 
						 "(aa(aaa)))aa(a))", 
						 "", 
						 "()", 
						 "((((()))))",
						 "(", 
						 "((())",
						 "((())))",
						 "((((a))", 
						 "aaaa(aa)a(((a)))aa", 
						 "aa(aa)a(aa))", 
						 ")(", 
						 ")a(a)a("}; 
		
		for (int i = 0; i < str.length; i++) {
			System.out.println("\"" + str[i] + "\" " + check(str[i]));
		}
	}
	
	static boolean check(String str) {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
            if (c == '(') {st.push(c);}
            else if(c == ')') {
                if (st.isEmpty()) return false;
                if (st.pop() != '(') return false;
            }
		}
		
		if (!st.empty()) return false; 
		
		return true; 

    }

}

