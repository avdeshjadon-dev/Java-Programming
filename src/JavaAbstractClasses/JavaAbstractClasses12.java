// ------------------- 12. Abstract Class GeometricShape -------------------
//
// Write a Java program to create an abstract class GeometricShape with abstract methods
// area() and perimeter(). Create subclasses Triangle and Square that extend the
// GeometricShape class and implement the respective methods to calculate the area
// and perimeter of each shape.
//
// ------------------- SAMPLE OUTPUT -------------------
// Triangle Area: 15.0
// Triangle Perimeter: 18.0
// Square Area: 25.0
// Square Perimeter: 20.0


package JavaAbstractClasses;

abstract class GeometricShape {
    public void display() {
        area();
        perimeter();
    }

    public abstract void area();

    public abstract void perimeter();
}

class Square extends GeometricShape {
    int sideOfSquare;

    Square(int sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public void area() {
        int area = sideOfSquare * sideOfSquare;
        System.out.println("Square Area : " + area);
    }

    @Override
    public void perimeter() {
        int perimeter = 4 * sideOfSquare;
        System.out.println("Square perimeter : " + perimeter);
    }
}

class Triangle1 extends GeometricShape {
    int sideOfTriangle1;
    int sideOfTriangle2;
    int sideOfTriangle3;

    Triangle1(int sideOfTriangle1, int sideOfTriangle2, int sideOfTriangle3) {
        this.sideOfTriangle1 = sideOfTriangle1;
        this.sideOfTriangle2 = sideOfTriangle2;
        this.sideOfTriangle3 = sideOfTriangle3;
    }

    @Override
    public void area() {
        double semi_perimeter = (sideOfTriangle1 + sideOfTriangle2 + sideOfTriangle3) / 2.0;
        double area = Math.sqrt(semi_perimeter * (semi_perimeter - sideOfTriangle1) * (semi_perimeter - sideOfTriangle2) * (semi_perimeter - sideOfTriangle3));
        System.out.println("Triangle Area : " +String.format("%.2f",area));
    }

    @Override
    public void perimeter() {
        int perimeter = sideOfTriangle1 + sideOfTriangle2 + sideOfTriangle3;
        System.out.println("Triangle perimeter : " + perimeter);
    }
}

public class JavaAbstractClasses12 {
    public static void main(String[] args) {
        GeometricShape square = new Square(10);
        GeometricShape triangle1 = new Triangle1(2, 3, 4);
        square.display();
        triangle1.display();
    }
}
