package HW9;
import java.util.Scanner; 

public class HW2020_9_1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		
		int score = keyboard.nextInt(); 
		double result; 
		
		if (score < 0) {
			System.out.println("Negative score " + score); 
		}
		else {
			result = score / 5.0; 
			System.out.println("Result: " + result); 
		}
		
		testByException(score); 
	}
	
	static void testByException(int score) {
        try {
            if (score / 5.0 < 0) {
                throw new MyException91(score);
            }
            System.out.println("Result: " + (score / 5.0)); 
        }
        catch (MyException91 e) {
            System.out.println("Negative score " + e.getScore());
        }
    }
}

class MyException91 extends Exception {
    private int score;

    public MyException91(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }
}

