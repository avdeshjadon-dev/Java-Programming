// ------------------- 5. Resizable Interface Implementation -------------------
//
// Write a Java program to create an interface Resizable with methods
// resizeWidth(int width) and resizeHeight(int height) that allow an object
// to be resized. Create a class Rectangle that implements the Resizable
// interface and implements the resize methods.
//
// ------------------- SAMPLE OUTPUT -------------------
// Original Width: 100, Original Height: 50
// Resized Width: 150, Resized Height: 75


package JavaInterface;
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle1 implements Resizable {

    private int height;
    private int width;

    public Rectangle1(int height, int width) {
        this.height = height;
        this.width = width;
    }
    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }
    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }
    public void display() {
        System.out.println("Resized Height: " + width + " Resized Width: " + height);
    }
}
public class JavaInterface5 {
    public static void main(String[] args) {
        Rectangle1 resizable = new Rectangle1(100, 200);
        System.out.println("Original Height: 100 Original Width: 200");

        resizable.resizeHeight(20);
        resizable.resizeWidth(30);

        resizable.display();
    }
}
