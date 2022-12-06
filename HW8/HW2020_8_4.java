package HW8;
public class HW2020_8_4 {

	public static void main(String[] args) {
		
		Shape84[] shape = new Shape84[2]; 
		
		shape[0] = new Rectangle84("Rect1", 3, 4, 2, 5); 
		shape[1] = new Circle84("Circ1", 7, 7, 3); 
		printShapeArray(shape); 
	}
	
	static void printShapeArray(Shape84[] shape) {
		for (int i = 0; i < shape.length; i++) {
			System.out.print("shape[" + i + "] ");
			System.out.print(shape[i]); 
			System.out.println(" area:" + shape[i].area()); 
		}
	}
}

abstract class Shape84 {
    String name; int x; int y;

    public Shape84(String name, int x, int  y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "name("+name+") center("+x+","+y+") ";
    }
    abstract double area();
}

class Rectangle84 extends Shape84 {
    private int width;
    private int height;

    public Rectangle84(String name, int x, int y, int width, int height) {
        super(name, x, y);
        this.width = width;
        this.height = height;
    }
    public String toString() {
        return super.toString()+"width("+width+") height("+height+")";
    }
    double area() {
        return width * height;
    }
}

class Circle84 extends Shape84 {
    private int radius;

    public Circle84(String name, int x, int y, int radius) {
        super(name, x, y);
        this.radius = radius;
    }
    public String toString() {
        return super.toString()+"radius("+radius+")";
    }
    double area() {
        return Math.PI * radius * radius;
    }
}