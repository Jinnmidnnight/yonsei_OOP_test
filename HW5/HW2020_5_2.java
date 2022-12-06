package HW5;
import java.util.Scanner;

public class HW2020_5_2 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
		Book52 book1 = new Book52("Little Prince");
		Book52 book2 = new Book52("King Arthur");
		boolean done = false; 
		
		do {
			System.out.println("numRead:" + Book52.getNumRead());
			System.out.print("1: ");; 
			System.out.println(book1);
			System.out.print("2: ");
			System.out.println(book2);
			
			int bookToRead = keyboard.nextInt(); // get book number
			
			switch (bookToRead) {
				case 1:
					book1.read();
					break;
				case 2:
					book2.read();
					break;
			}
			
			if (Book52.getNumRead() >= 5) {
				System.out.println("numRead:" + Book52.getNumRead());
				System.out.print("1: ");; 
				System.out.println(book1);
				System.out.print("2: ");
				System.out.println(book2);
				System.out.println("end"); 
				done = true;
			}
		} while(!done); 

    }
}

class Book52 {
    private String title;
    private static int num;

    public String toString() {
        return "[BOOK} name("+title+")";
    }
    public static void read() {
        num ++;
    }
    public Book52(String title) {
        this.title = title;
    }
    public static int getNumRead() {
        return num;
    }
}