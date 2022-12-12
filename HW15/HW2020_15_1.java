package HW15;
public class HW2020_15_1 {

	public static void main(String[] args) {
		LinkedList3<Integer> list1 = new LinkedList3<Integer>();
		LinkedList3<String> list2 = new LinkedList3<String>(); 
		list1.addToStart(4);
		list1.addToStart(7);
		list1.addToStart(2);
		list1.addToStart(9);
		
		System.out.println("list1=" + list1); 
		System.out.println("list1.reverseToString()=" + list1.reverseToString());
		System.out.println("list2=" + list2); 
		System.out.println("list2.reverseToString()=" + list2.reverseToString());	
		System.out.println();
		
		list2.addToEnd("KOREA"); 
		System.out.println("list2=" + list2); 
		list2.addToEnd("SEOUL");
		System.out.println("list2=" + list2); 
		list2.deleteEndNode();
		System.out.println("list2=" + list2); 
		list2.deleteEndNode();
		System.out.println("list2=" + list2); 
		list2.deleteEndNode();
		System.out.println("list2=" + list2); 
	}

}

class LinkedList3<T> {
    Node<T> head;

    public void deleteEndNode() {
        if (head == null) {
            return; 
        }
        if (head.link == null) {
            head = null;
            return;
        }

        Node<T> position = head;
        while (position.link.link != null) {
            position = position.link;
        }
        position.link = null;
    }
    public void addToEnd(T data) {
        if (head == null) {
            head = new Node<T>(data, null); 
            return; 
        }

        Node<T> position = head;
        while (true) {
            if (position.link != null) {
                position = position.link;
                continue;
            }
            position.link = new Node<T>(data, null);
            break;    
        }
    }
    public String reverseToString() {
        return sub(head);
    }
    private String sub(Node<T> first) {
        if (first == null) return ""; // stopping case
        return (sub(first.link) + first.data + " ").strip(); 
    }
    public LinkedList3() {}
    public void addToStart(T data) {
        head = new Node<T>(data, head);
    }
    public String toString() {
        Node<T> position = head;
        String s = "";
        while (position != null) {
            if (position.link != null) {
                s += position.data + " ";
            }
            else {
                s += position.data;
            }
            position = position.link;
        }
        return s;
    }

    private class Node<T> {
        private T data;
        private Node<T> link;

        public Node(T newData, Node<T> linkValue) {
            data = newData; link = linkValue;
        }
    }
}
