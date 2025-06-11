// ------------------- 8. Overloading Constructors with Different Data Types -------------------
//
// Create a class called "Point" with instance variables x and y.
// Implement overloaded constructors:
//   - One taking int parameters
//   - One taking double parameters
// Print the values for each constructor.
//
// ------------------- SAMPLE OUTPUT -------------------
// Integer Constructor:
// x: 5
// y: 10
//
// Double Constructor:
// x: 5.5
// y: 10.5


package JavaConstructor;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void display() {
        System.out.println("Point(X,Y) : (" + getX() + ", " + getY() + ")");
    }
}

public class Constructor8 {


    public static void main(String[] args) {
        Point myPoint1 = new Point(5, 7);
        myPoint1.display();
        Point myPoint2 = new Point(2.23, 3.43);
        myPoint2.display();
    }
}
