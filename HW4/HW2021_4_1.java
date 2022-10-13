package HW4;
import java.util.Scanner;

public class HW2021_4_1 {
    public static void main (String[] args) {
        Person41 p1 = new Person41(); 
		p1.readInput(); 
		
		String p1Name = p1.getName();
		int p1Age = p1.getAge(); 
		int p1MonthBirth = p1.getMonthBirth();
		String p1MonthBirthName = p1.getMonthName();
		
		System.out.println(p1Name + " " + p1Age + " " + p1MonthBirth + " " + p1MonthBirthName); 
		System.out.println(p1.info());

    }
}

class Person41 {
    private String name;
    private int age;
    private int MonthBirth;

    public String info() {
        return "[PERSON] name(" + name + ") age(" + age + ") month(" + getMonthName() + ")";
    }
    public String getMonthName() {
        switch (MonthBirth) {
            case 1:
                return "JAN";
            case 2:
                return "FEB";
            case 3:
                return "MAR";
            case 4:
                return "APR";
            case 5:
                return "MAY";
            case 6:
                return "JUN";
            case 7:
                return "JUL";
            case 8:
                return "AUG";
            case 9:
                return "SEP";
            case 10:
                return "OCT";
            case 11:
                return "NOV";
            default:
                return "DEC";
        }
    }
    public String getName() {
        return name;
    }
    public int getMonthBirth() {
        return MonthBirth;
    }
    public int getAge() {
        return age;
    };
    public Person41() {};
    public void readInput() {
        Scanner keyboard = new Scanner(System.in);

        name = keyboard.next();
        age = keyboard.nextInt();
        MonthBirth = keyboard.nextInt(); 
    }
}