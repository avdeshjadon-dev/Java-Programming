// ------------------- 1. Abstract Class and Method -------------------
//
// Write a Java program to create an abstract class Animal with an abstract
// method called sound(). Create subclasses Lion and Tiger that extend the
// Animal class and implement the sound() method to make a specific sound
// for each animal.
//
// ------------------- SAMPLE OUTPUT -------------------
// Lion roars
// Tiger growls


package JavaAbstractClasses;
abstract class Animal{
    public abstract void sound();
}
class Lion extends Animal{
    @Override
    public void sound() {
        System.out.println("Lion roars : ");
    }
}
class Tiger extends Animal{
    @Override
    public void sound() {
        System.out.println("Tiger growls :");
    }
}
public class JavaAbstractClasses1 {
    public static void main(String[] args) {
        Animal lion=new Lion();
        lion.sound();

        Animal tiger=new Tiger();
        tiger.sound();
    }

}
