package HW16;
import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections; 

public class HW2020_16_2 {

	public static void main(String[] args) {
		int[] a = {3, 7, 1, 9, 5, 6, 2}; 
		
		System.out.println(Arrays.toString(a));

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int i=0; i<a.length; i++) {
            queue.add(a[i]);
        }
		
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(queue.poll());
			if (i < a.length - 1) System.out.print(", ");
		}
		System.out.println("]");

        PriorityQueue<Integer> queuer = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i=0; i<a.length; i++) {
            queuer.add(a[i]);
        }

        System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(queuer.poll());
			if (i < a.length - 1) System.out.print(", ");
		}
		System.out.println("]");
	}

}
