// ------------------- 8. Method Overriding -------------------
//
// Write a Java program to create a class called Shape with methods called
// getPerimeter() and getArea(). Create a subclass called Circle that overrides
// the getPerimeter() and getArea() methods to calculate the area and perimeter
// of a circle.
//
// ------------------- SAMPLE OUTPUT -------------------
// Perimeter of Circle: 31.42
// Area of Circle: 78.5


package JavaInheritance;

class Shape1 {
    private final double PI = 3.14;
    private double rad;

    Shape1(double rad) {
        this.rad = rad;
    }

    void getParameter() {
        System.out.println("Parameter");
    }

    void getArea() {
        System.out.println("Area");
    }

    double getPI() {
        return PI;
    }

    double getRad() {
        return rad;
    }
}

class Circle extends Shape1 {

    Circle(double rad) {
        super(rad);
    }

    @Override
    void getArea() {
        double area = getPI() * getRad() * getRad();
        System.out.println("Area of circle : " + String.format("%.2f", area));
    }

    @Override
    void getParameter() {
        double parameter = 2 * getPI() * getRad();
        System.out.println("Parameter of circle : " + String.format("%.2f", parameter));
    }
}

public class JavaInheritance8 {
    public static void main(String[] args) {
        Shape1 shape1 = new Shape1(20);
        shape1.getArea();
        shape1.getParameter();

        Circle circle = new Circle(10);
        circle.getArea();
        circle.getParameter();
    }
}
