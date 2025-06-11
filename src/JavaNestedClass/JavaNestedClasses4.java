// ------------------- 4. Anonymous Class -------------------
//
// Write a Java program to create an interface called "Greeting" with a method "sayHello()".
// In the main method, create an anonymous class that implements the Greeting interface
// and override the "sayHello()" method to print "Hello, World!".
// Call the "sayHello()" method.
//
// ------------------- SAMPLE OUTPUT -------------------
// Hello, World!

package JavaNestedClass;

interface Greeting {
    void sayHello();
}

public class JavaNestedClasses4 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };
        greeting.sayHello();
    }
}
