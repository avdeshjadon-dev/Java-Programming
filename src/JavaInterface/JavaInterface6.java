// ------------------- 6. Drawable Interface with Shape Implementations -------------------
//
// Write a Java program to create an interface Drawable with a method draw() that
// takes no arguments and returns void. Create three classes Circle, Rectangle,
// and Triangle that implement the Drawable interface and override the draw()
// method to draw their respective shapes.
//
// ------------------- SAMPLE OUTPUT -------------------
// Drawing Circle
// Drawing Rectangle
// Drawing Triangle

package JavaInterface;
interface Drawable {
    void draw();
}
class Circle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle2 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Triangle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
public class JavaInterface6 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        Rectangle2 rectangle2 = new Rectangle2();
        Triangle1 triangle1 = new Triangle1();
        circle1.draw();
        rectangle2.draw();
        triangle1.draw();
    }
}
