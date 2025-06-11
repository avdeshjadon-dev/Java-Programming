// ------------------- 2. Abstract Class Shape -------------------
//
// Write a Java program to create an abstract class Shape with abstract methods
// calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle
// that extend the Shape class and implement the respective methods to calculate
// the area and perimeter of each shape.
//
// ------------------- SAMPLE OUTPUT -------------------
// Circle Area: 78.54
// Circle Perimeter: 31.42
// Triangle Area: 10.83
// Triangle Perimeter: 18.00


package JavaAbstractClasses;

abstract class Shape {
    final double PI = 3.14;

    public abstract void calculatArea();

    public abstract void calculatePerimeter();

    public void display() {
        calculatArea();
        calculatePerimeter();
    }
}

class Circle extends Shape {
    int rad;

    Circle(int rad) {
        this.rad = rad;
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * PI * rad;
        System.out.println("Perimeter of Circle is : " + String.format("%.2f", perimeter));
    }

    @Override
    public void calculatArea() {
        double area = PI * rad * rad;
        System.out.println("Area of Circle is : " + String.format("%.2f", area));
    }
}

class Triangle extends Shape {
    double a;
    double b;
    double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = a + b + c;
        System.out.println("Perimeter of Triangle is : " + String.format("%.2f", perimeter));
    }

    @Override
    public void calculatArea() {
        double perimeter = a + b + c;
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of Triangle is : " + String.format("%.2f", area));
    }

}

public class JavaAbstractClasses2 {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape triangle = new Triangle(10, 10, 10);
        circle.display();
        triangle.display();
       
    }
}
