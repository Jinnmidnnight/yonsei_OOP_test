package HW5;

public class HW2021_5_3 {
    public static void main (String[] args) {
        		
		Person53 p1 = new Person53("Jane", 45); 
		Person53 p2 = new Person53("Brown", 29);
        Person53 p3 = new Person53(p1); 

        System.out.println(p3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(); 
		
		Book53 book1 = new Book53(); 
		Book53 book2 = new Book53("Sunday Morning", p1);
		Book53 book3 = new Book53(book2);
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3); 
		System.out.println(); 
		
		p1.setName("Tom"); 
		p1.setAge(33);

        System.out.println(p3);
		book2.setTitle("Sunset on the beach");
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3); 
		System.out.println(); 
		
		book1.setTitle("The load to Seoul");
		book1.setAuthor(p2);
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3); 

    }
}

class Person53 {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "[PERSON] name("+name+") age("+age+")";
    }
    public Person53(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person53(Person53 other) {
        name = other.name;
        age = other.age;
    }
}

class Book53 {
    private String title;
    private Person53 author;

    public String toString() {
        return "[BOOK} title("+title+") author("+author+")";
    }
    public void setAuthor(Person53 p) {
        author = new Person53(p);
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Book53(Book53 other) {
        title = other.title;
        author = new Person53(other.author);
    }
    public Book53(String title, Person53 p) {
        this.title = title;
        this.author = p;
    }
    public Book53() {
        title = "no Title";
    }
}