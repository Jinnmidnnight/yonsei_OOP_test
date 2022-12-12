package HW14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections; 

public class HW2020_14_1 {

	public static void main(String[] args) {

		ArrayList<Integer> intList1 = new ArrayList<Integer>(Arrays.asList(1, 4, 4, 5, 5, 6, 7, 8, 9));
        ArrayList<Integer> intList2 = new ArrayList<Integer>(Arrays.asList(1, 1, 4, 5, 6, 7, 11, 12, 13, 14));
		ArrayList<String> strList1 = new ArrayList<String>(Arrays.asList("ace", "boy", "boy", "him", "inn", "jaw", "leg"));
		ArrayList<String> strList2 = new ArrayList<String>(Arrays.asList("abc", "abc", "key", "law", "leg", "xyz"));

		
		Collections.sort(intList1);
		Collections.sort(intList2);
		Collections.sort(strList1);
		Collections.sort(strList2);
		
		System.out.println("intList1=" + intList1); 		
		System.out.println("intList2=" + intList2);
		System.out.println("strList1=" + strList1); 
		System.out.println("strList2=" + strList2); 
		
		ArrayList<Integer> intList3 = toSet(intList1); 
		ArrayList<Integer> intList4 = toSet(intList2); 
		ArrayList<String> strList3 = toSet(strList1); 
		ArrayList<String> strList4 = toSet(strList2);
		
		System.out.println("intList3=" + intList3); 
		System.out.println("intList4=" + intList4); 
		System.out.println("strList3=" + strList3); 
		System.out.println("strList4=" + strList4); 
		
		ArrayList<Integer> interIntList = intersect(intList3, intList4); 
		ArrayList<String> interStrList = intersect(strList3, strList4); 
		ArrayList<Integer> diffIntList = difference(intList3, intList4); 
		ArrayList<String> diffStrList = difference(strList3, strList4); 
		ArrayList<Integer> uniIntList = union(intList3, intList4); 
		ArrayList<String> uniStrList = union(strList3, strList4); 
		
		Collections.sort(uniIntList);
		Collections.sort(uniStrList);
		
		System.out.println("interIntList=" + interIntList); 
		System.out.println("interStrList=" + interStrList); 
		System.out.println("diffIntList=" + diffIntList); 
		System.out.println("diffStrList=" + diffStrList); 
		System.out.println("uniIntList=" + uniIntList); 
		System.out.println("uniStrList=" + uniStrList); 
		
	}
	
    static <T> ArrayList<T> toSet(ArrayList<T> a) {
        ArrayList<T> data = new ArrayList<T>();

        for (int i=0; i<a.size(); i++) {
            if (data.contains(a.get(i)) == false) {
                data.add(a.get(i));
            }
        }
        return data;
    }

    static <T> ArrayList<T>  intersect(ArrayList<T> a, ArrayList<T> b) {
        ArrayList<T> data = new ArrayList<T>(a);

        data.retainAll(b);
        return data;
    }

    static <T> ArrayList<T>  difference(ArrayList<T> a, ArrayList<T> b) {
        ArrayList<T> data = new ArrayList<T>(a);

        data.removeAll(b);
        return data;
    }

    static <T> ArrayList<T>  union(ArrayList<T> a, ArrayList<T> b) {
        ArrayList<T> data = new ArrayList<T>();

        data.addAll(a);
        data.removeAll(intersect(a, b));
        data.addAll(b);
        return data;
    }

}

