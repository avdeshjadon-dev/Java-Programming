// ------------------- 7. Static Block for Complex Initialization -------------------
//
// Write a Java program to create a class called "ComplexInitializer" with a static block
// that initializes multiple static variables (x, y, z) using complex logic. Print the
// values of these variables in the main method.
//
// ------------------- SAMPLE OUTPUT -------------------
// x: 10
// y: 20
// z: 30


package JavaStaticMembers;

class ComplexInitializer {
    private static int x;
    private static int y;
    private static int z;

    static {
        x = 10;
        y = 20;
        z = calculateZ(x, y);
    }

    private static int calculateZ(int a, int b) {
        return a * b + (a - b);
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int getZ() {
        return z;
    }
}

public class JavaStaticMember7 {


    public static void main(String[] args) {
        System.out.println("Value of x: " + ComplexInitializer.getX());
        System.out.println("Value of y: " + ComplexInitializer.getY());
        System.out.println("Value of z: " + ComplexInitializer.getZ());
    }
}
