package HW3;
import java.util.Scanner;

public class HW2020_3_1 {
    public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int target1 = keyboard.nextInt(); 
		int target2 = keyboard.nextInt();
		
		boolean begin = true; 
		
		for (int i=1; i<100; i++) {
			if (i % target1 == 0) { 
				if (!begin) {
					System.out.print(",");
				}
				else {
					begin = false; 
				}
				System.out.print(i);
			}	
		}

		begin = true; 
		System.out.println(); 
		
		for (int i=1; i<100; i++) {
			if (i % target2 == 0) { 
				if (!begin) {
					System.out.print(",");
				}
				else {
					begin = false; 
				}
				System.out.print(i);
			}	
		}
				
		begin = true; 
		System.out.println(); 
		
		for (int i=1; i<100; i++) {
			if ((i % target1 == 0) && (i % target2 == 0)) { 
				if (!begin) {
					System.out.print(",");
				}
				else {
					begin = false; 
				}
				System.out.print(i);
			}	
		}

    }
}
