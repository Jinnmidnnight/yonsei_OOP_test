package HW4;

public class HW2021_4_3 {
    public static void main(String[] args) {
		Book book1 = new Book(); 
		Book book2 = new Book("Son of God", "Mark Lee", 387); 
		Book book3 = new Book("Moon Flower", "Jenny Kim", 265); 
		Book book4 = new Book("Son of God", "Mark Lee", 387); 
		
		System.out.println("book1: " + book1); 
		System.out.println("book2: " + book2); 
		System.out.println("book3: " + book3); 
		System.out.println("book4: " + book4); 
		
		book1.setTitle("English Practice");
		book1.setAuthor("John Brown"); 
		book1.setNumPages(125); 
		
		System.out.println("book1: " + book1); 
		System.out.println("book1's author: " + book1.getAuthor()); 
		
		System.out.println("book2 equals book3? " + book2.equals(book3)); 
		System.out.println("book2 equals book4? " + book2.equals(book4)); 
	}

}

class Book {
    private String title;
    private String author;
    private int numPages;

    public String toString() {
        return "[BOOK] title("+title+") author("+author+") pages("+numPages+")";
    }
    public boolean equals(Book other) {
        if (title.equals(other.title) && author.equals(other.author) && numPages == other.numPages) {
            return true;
        }
        return false;
    }
    public String getAuthor() {
        return author;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }
    public Book() {
        title = "no title";
        author = "noname";
        numPages = 0;
    };
}
