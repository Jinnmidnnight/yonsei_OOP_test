package HW14;
import java.util.ArrayList;

public class HW2020_14_3 {

	public static void main(String[] args) {
		
        ArrayList<Integer> m1 = new ArrayList<Integer>(3);
        m1.add(1); m1.add(2); m1.add(3);

        ArrayList<Double> m2 = new ArrayList<Double>(3);
        m2.add((double)1); m2.add((double)2); m2.add((double)3);

        NumList143<Integer> list1 = new NumList143<Integer>(m1);
        NumList143<Double> list2 = new NumList143<Double>(m2);
		
		System.out.print(list1 + " "); 
		System.out.println(list1.average()); 
		
		System.out.print(list2 + " "); 
		System.out.println(list2.average()); 
	}
	
}

class NumList143<T extends java.lang.Number> {
    private ArrayList<T> a;

    public NumList143(ArrayList<T> a) {
        this.a = new ArrayList<T>(a);
    }
    public String toString() {
        return ""+a;
    }
    public double average() {
        double total = 0;

        for (T e : a) {
            total += e.doubleValue();
        }
        return total / a.size();
    }
    
}
