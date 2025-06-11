// ------------------- 2. Interface and Implementation -------------------
//
// Write a Java program to create an Animal interface with a method called bark()
// that takes no arguments and returns void. Create a Dog class that implements
// Animal and overrides bark() to print "Dog is barking".
//
// ------------------- SAMPLE OUTPUT -------------------
// Dog is barking


package JavaInterface;
interface Animal {
    void bark();
}
class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}
public class JavaInterface2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}

