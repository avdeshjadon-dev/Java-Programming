// ------------------- 3. Static Block -------------------
//
// Write a Java program to create a class called "Initializer" with a static block
// that initializes a static variable 'initialValue' to 1000. Print the value of
// 'initialValue' before and after creating an instance of "Initializer".
//
// ------------------- SAMPLE OUTPUT -------------------
// Before creating instance: 1000
// After creating instance: 1000


package JavaStaticMembers;

class Initializer {
    public static int initialvalue;

    static {
        initialvalue = 1000;
        System.out.println("Static block : initialValue initialized to : " + initialvalue);
    }
}

public class JavaStaticMember3 {

    public static void main(String[] args) {
        System.out.println("Before creating an instance : initialValue : " + Initializer.initialvalue);
        Initializer initializer = new Initializer();
        System.out.println("After creating an instance : initialValue : " + Initializer.initialvalue);
    }
}
