// ------------------- 5. Rectangle Class with Copy Constructor -------------------
//
// Create a class called "Rectangle" with instance variables length and width.
// Implement:
//   - A parameterized constructor
//   - A copy constructor that initializes using an existing object
// Print the values of the variables.
//
// ------------------- SAMPLE OUTPUT -------------------
// Parameterized Constructor:
// Length: 10
// Width: 5
//
// Copy Constructor:
// Length: 10
// Width: 5


package JavaConstructor;

class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}

public class Constructor5 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println("Length : " + rectangle.getLength());
        System.out.println("Width : " + rectangle.getWidth());

    }
}
