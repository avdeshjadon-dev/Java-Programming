// ------------------- 3. Method Overriding -------------------
//
// Write a Java program to create a class called Shape with a method called
// getArea(). Create a subclass called Rectangle that overrides the getArea()
// method to calculate the area of a rectangle.
//
// ------------------- SAMPLE OUTPUT -------------------
// Area of Rectangle: 50


package JavaInheritance;

class Shape {
    double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double getArea() {
        return length * breadth;
    }
}

public class JavaInheritance3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(23.3, 34.3);
        double ans = rectangle.getArea();
        System.out.println("Area of rectangle is : " + String.format("%.2f", rectangle.getArea()));
    }
}
