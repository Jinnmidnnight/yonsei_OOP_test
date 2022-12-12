package HW14;
public class HW2020_14_2 {

	public static void main(String[] args) {
		String name1 = "Tom"; 
		String name2 = "Jane"; 
		int age1 = 25; 
		int age2 = 21; 
		double score1 = 3.5; 
		double score2 = 4.1; 
		char grade1 = 'B'; 
		char grade2 = 'A'; 
		
		Pair142<String, Integer> nameAge1 = new Pair142<String, Integer>(name1, age1);
        Pair142<String, Integer> nameAge2 = new Pair142<String, Integer>(name2, age2);
        Pair142<Double, Character> scoreGrade1 = new Pair142<Double, Character>(score1, grade1);
        Pair142<Double, Character> scoreGrade2 = new Pair142<Double, Character>(score2, grade2);
		
		System.out.println(nameAge1);
		System.out.println(nameAge2); 
		System.out.println(scoreGrade1); 
		System.out.println(scoreGrade2); 
		
		System.out.println(nameAge1.compareTo(nameAge2));
		System.out.println(nameAge1.compareTo(nameAge1)); 
		System.out.println(scoreGrade1.compareTo(scoreGrade2)); 
	}
}

class Pair142<T1 extends Comparable<T1>, T2 extends Comparable<T2>> {
    private T1 first; private T2 second;

    public Pair142(T1 first, T2 second) {
        this.first = first; this.second = second;
    }
    public String toString() {
        return "("+first+", "+second+")";
    }
    public int compareTo(Pair142<T1, T2> other) {
        int data1Comp = first.compareTo(other.first);

        if (data1Comp > 0 ){
            return 1;
        }
        else if (data1Comp < 0) {
            return -1;
        }
        else {
            return second.compareTo(other.second);
        }
    }

}