package HARD;
public class HW2020_13_2 {

	public static void main(String[] args) {
		Student132 s0 = new Student132("Evan"), 
				   s1 = new Student132("Gary"), 
				   s2 = new Student132("Joe"), 
				   s3 = new Student132("Sam"), 
				   s4 = new Student132("Tom"), 
				   s5 = new Student132("Patty"), 
				   s6 = new Student132("Jane"); 
		
		Student132[] s = {s0, s1, s2, s3, s4}; 
		
		searchComparable(s, s5);
		searchComparable(s, s4); 
		searchComparable(s, s0); 
		searchComparable(s, s6); 
		searchComparable(s, s2);
		
		Fraction132 f0 = new Fraction132(-5, 2),  
				    f1 = new Fraction132(-7, 3), 
				    f2 = new Fraction132(0, 4),  
				    f3 = new Fraction132(2, 4),  
				    f4 = new Fraction132(3, 2),  
				    f5 = new Fraction132(1, 3), 
				    f6 = new Fraction132(-1, 2), 
				    f7 = new Fraction132(1, 2); 
		
		Fraction132[] f = {f0, f1, f2, f3, f4}; 
		
		searchComparable(f, f2);
		searchComparable(f, f4);
		searchComparable(f, f3);
		searchComparable(f, f5);
		searchComparable(f, f6); 
		searchComparable(f, f7); 
	}
	
	static void searchComparable(Comparable[] data, Comparable nData) {
        int index = GeneralizedBinarySearch.search(data, 0, data.length, nData);

        if (index != -1) {
            System.out.println(nData+" found at index "+index);
        }
        else {
            System.out.println(nData+" not found");
        }
    }
}

class GeneralizedBinarySearch {
    public static int search(Comparable[] s, int first, int last, Comparable key) {
        if (first > last) {
            return -1;
        }
        else {
            int mid = (first + last) / 2;

            if (key.compareTo(s[mid]) == 0) {
                return mid;
            }
            else if (key.compareTo(s[mid]) < 0) {
                return search(s, first, last-1, key);
            }
            else {
                return search(s, first+1, last, key);
            }

        }
    }
}

class Student132 implements Comparable {
    private String name;

    public Student132(String name) {this.name = name;}
    public int compareTo(Object other) {
        Student132 student = (Student132) other;
        return name.compareTo(student.name);
    }
    public String toString() {
        return name;
    }

}

class Fraction132 implements Comparable {
    private int x; private int y;

    public Fraction132(int x, int y) {this.x=x; this.y=y;}
    public int compareTo(Object other) {
        Fraction132 nFraction = (Fraction132) other;
        String f1 = String.valueOf((double)x / (double)y);
        String f2 = String.valueOf((double)nFraction.x / (double) nFraction.y);
        return f1.compareTo(f2);
    }
    public String toString() {
        return "("+x+","+y+")";
    }
}