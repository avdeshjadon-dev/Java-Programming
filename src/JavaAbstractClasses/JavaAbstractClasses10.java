// ------------------- 10. Abstract Class Shape2D -------------------
//
// Write a Java program to create an abstract class Shape2D with abstract methods
// draw() and resize(). Create subclasses Rectangle and Circle that extend the
// Shape2D class and implement the respective methods to draw and resize each shape.
//
// ------------------- SAMPLE OUTPUT -------------------
// Rectangle drawn and resized
// Circle drawn and resized


package JavaAbstractClasses;

abstract class Shape2D {

    public void display() {
        draw();
        resize();
    }

    public abstract void draw();

    public abstract void resize();
}

class Rectangle extends Shape2D {
    @Override
    public void draw() {
        System.out.print("Rectangle drawn and ");
    }

    @Override
    public void resize() {
        System.out.println("resized");
    }
}

class Circle1 extends Shape2D {
    @Override
    public void draw() {
        System.out.print("Circle1 drawn and ");
    }

    @Override
    public void resize() {
        System.out.println("resized");
    }
}

public class JavaAbstractClasses10 {
    public static void main(String[] args) {
        Shape2D rectangle = new Rectangle();
        Shape2D circle1 = new Circle1();
        rectangle.display();
        circle1.display();
    }
}
