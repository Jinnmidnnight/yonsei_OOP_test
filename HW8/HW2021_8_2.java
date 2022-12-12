package HW8;
public class HW2021_8_2 {

	public static void main(String[] args) {
		
		Book82 b1 = new Book82("Eternal dream", 3200); 
		Book82 b2 = new Book82("Healthier today", 2800); 
		ComicBook82 c1 = new ComicBook82("Micky mouse", 5400, 21); 
		ComicBook82 c2 = new ComicBook82("Donald duck", 6200, 17); 
		Novel82 n1 = new Novel82("Gone with the wind", 4200, 542); 
		Novel82 n2 = new Novel82("Summer night dream", 5600, 483); 
		
		System.out.println(b1.betterThan(c1));
		System.out.println(b1.betterThan(b2));
		System.out.println(c1.betterThan(null));
		System.out.println(c2.betterThan(c1));
		System.out.println(n1.betterThan(n2));
		System.out.println(n1.betterThan(b2));
	}
}

class Book82 {
	String title; int price;

	public String betterThan(Book82 other) {
		if (other == null ) {return "Impossible comparison. other==null";}
		else if (getClass() != other.getClass()) {return "Impossible comparison. different classes.";}
		
		if (other instanceof ComicBook82) {
			ComicBook82 nThis = (ComicBook82) this;
			ComicBook82 nOther = (ComicBook82) other;
			
			if (nThis.numCha < nOther.numCha) {return nOther.title+" is better than "+nThis.title;}
			return nThis.title+" is better than "+nOther.title;
		}
		else if (other instanceof Novel82) {
			Novel82 nThis = (Novel82) this;
			Novel82 nOther = (Novel82) other;

			if (nThis.numPage < nOther.numPage) {return nOther.title+" is better than "+nThis.title;}
			return nThis.title+" is better than "+nOther.title;
		}
		else {
			if (price < other.price) {return other.title+" is better than "+title;} 
			return title+" is better than "+other.title; 
		}
	};
	public Book82(String title, int price) {
		this.title = title; this.price = price;
	}
}

class ComicBook82 extends Book82 {
	int numCha;

	public ComicBook82(String title, int price, int numCha) {
		super(title, price); this.numCha = numCha;
	}
}

class Novel82 extends Book82 {
	int numPage;

	public Novel82(String title, int price, int numPage) {
		super(title, price); this.numPage = numPage;
	}
}


