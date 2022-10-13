package HW4;

public class HW2020_4_1 {
	
	public static void main(String args[]) {
	
		Point p1 = new Point(); 
		Point p2 = new Point(3, 5); 

		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println();
		
		p1.setXY(1, 2); 
		
		System.out.println("p1: " + p1);
		System.out.println("p2 has coordinates: (" + p2.getX() + ", " 
		                                           + p2.getY() + ")");
		System.out.println("distance between p1 and p2 = " + p1.distance(p2));
		System.out.println(); 
		
		p2.setXY(1, 2); 	
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p1 is the same as p2? " + p1.equals(p2)); 
		System.out.println();
	}
}

class Point {
    private double x;
    private double y;

    public boolean equals(Point other) {
        if (x==other.x && y==other.y) {
            return true;
        }
        else {
            return false;
        }
    }
    public double distance(Point q) {
        return Math.sqrt((q.getX() - x) * (q.getX() - x)
                        + (q.getY() - y) * (q.getY() - y));
    }
    public double getY() {
        return y;
    }
    public double getX() {
        return x;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "[POINT] (" + x + "," + y + ")";
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        x = 0;
        y = 0;
    };

}