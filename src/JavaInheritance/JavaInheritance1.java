// ------------------- 1. Method Overriding -------------------
//
// Write a Java program to create a class called Animal with a method called
// makeSound(). Create a subclass called Cat that overrides the makeSound()
// method to bark.
//
// ------------------- SAMPLE OUTPUT -------------------
// The cat barks


package JavaInheritance;

class Animal{
    void makeSound(){
        System.out.println("There is a sound :");
    }
}
class SubClass extends Animal{
    @Override
    void makeSound() {
        System.out.println("Yaha par maine override kar diya hai:");
    }
}
public class JavaInheritance1 {
    public static void main(String[] args) {
//        Animal animal=new Animal();
//        animal.makeSound();

        SubClass subClass=new SubClass();
        subClass.makeSound();
    }
}
