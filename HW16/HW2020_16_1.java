package HW16;
import java.util.*;

public class HW2020_16_1 {
    public static void main (String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for (int i=0; i<1000000; i++) {
            list1.add(0);
            list2.add(0);
        }

        long start = System.currentTimeMillis(); 
        list1.remove(0);
        long end = System.currentTimeMillis(); 
        double time1 = (end - start) / 1000.0; // time in seconds 

        start = System.currentTimeMillis(); 
        list2.remove(0);
        end = System.currentTimeMillis(); 
        double time2 = (end - start) / 1000.0; // time in seconds

        list1.add(0);
        list2.add(0);

        System.out.print("Time to delete first element: ArratList ");
        if (time1 < time2) {System.out.print("<");}
        else if (time1 > time2) {System.out.print(">");}
        else {System.out.print("=");}
        System.out.println(" LinkedList");

        start = System.currentTimeMillis(); 
        list1.get(899999);
        end = System.currentTimeMillis(); 
        double time3 = (end - start) / 1000.0; // time in seconds 

        start = System.currentTimeMillis(); 
        list2.get(899999);
        end = System.currentTimeMillis(); 
        double time4 = (end - start) / 1000.0; // time in seconds 

        System.out.print("Time to access 900000th element: ArrayList ");
        if (time3 < time4) {System.out.print("<");}
        else if (time3 > time4) {System.out.print(">");}
        else {System.out.print("=");}
        System.out.println(" LinkedList");

    }

}
