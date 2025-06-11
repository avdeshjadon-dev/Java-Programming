// ------------------- 6. Abstract Class Shape3D -------------------
//
// Write a Java program to create an abstract class Shape3D with abstract methods
// calculateVolume() and calculateSurfaceArea(). Create subclasses Sphere and Cube
// that extend the Shape3D class and implement the respective methods to calculate
// the volume and surface area of each shape.
//
// ------------------- SAMPLE OUTPUT -------------------
// Sphere Volume: 523.6
// Sphere Surface Area: 314.16
// Cube Volume: 1000.0
// Cube Surface Area: 600.0


package JavaAbstractClasses;

abstract class Shape3D {
    final double PI = 3.14;
    double rad;
    double side_len;

    Shape3D(double rad, double side_len) {
        this.rad = rad;
        this.side_len = side_len;
    }

    public void display() {
        calculateVolume();
        calculateSurfaceArea();
    }

    public abstract void calculateVolume();

    public abstract void calculateSurfaceArea();
}

class Sphere extends Shape3D {
    Sphere(double rad, double side_len) {
        super(rad, side_len);
    }

    double area = 4 * PI * rad * rad;

    @Override
    public void calculateSurfaceArea() {
        System.out.println("Area of Sphere : " + area);
    }

    @Override
    public void calculateVolume() {
        double volume = 4 / 3 * PI * rad * rad * rad;
        System.out.println("Volume of Sphere : " + volume);
    }
}

class Cube extends Shape3D {
    Cube(double rad, double side_len) {
        super(rad, side_len);
    }

    @Override
    public void calculateSurfaceArea() {
        double area = 6 * side_len * side_len;
        System.out.println("Area of Cube : " + area);
    }

    @Override
    public void calculateVolume() {
        double volume = side_len * side_len * side_len;
        System.out.println("Volume of Cube : " + volume);
    }
}

public class JavaAbstractClasses6 {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(12, 10);
        Shape3D cube = new Cube(3, 7);
        sphere.display();
        cube.display();
    }
}
