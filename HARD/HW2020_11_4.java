package HARD;
public class HW2020_11_4 {
	
	public static void main(String[] args) {
		
        Student114[] s = {new Student114("Evan"),
                        new Student114("Gary"),
                        new Student114("Joe"),
                        new Student114("Sam"),
                        new Student114("Tom")};
        
        searchStudent(s, "Gary");
        searchStudent(s, "Patty");
        searchStudent(s, "Tom");
        searchStudent(s, "Evan");
        searchStudent(s, "Jane");
        searchStudent(s, "Joe");
    }

    static void searchStudent(Student114[] s, String name) {
        int index = BinarySearchStudent114.search(s, 0, s.length, name);
        if (index != -1) {
            System.out.println(name+" found at index "+index);
        }
        else {
            System.out.println(name+" not found ");
        }
    }
}

class Student114 {
    private String name;

    public Student114(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class BinarySearchStudent114 {
    public static int search(Student114[] s, int first, int last, String name) {
        if (first > last) {
            return -1;
        }
        else {
            int mid = (first + last) / 2;

            if (name.compareTo(s[mid].getName()) == 0) {
                return mid;
            }
            else if (name.compareTo(s[mid].getName()) < 0) {
                return search(s, first, last-1, name);
            }
            else {
                return search(s, first+1, last, name);
            }
        }
    }
}
