// ------------------- 11. Abstract Class Bird -------------------
//
// Write a Java program to create an abstract class Bird with abstract methods
// fly() and makeSound(). Create subclasses Eagle and Hawk that extend the Bird
// class and implement the respective methods to describe how each bird flies
// and makes a sound.
//
// ------------------- SAMPLE OUTPUT -------------------
// Eagle soars high and screeches
// Hawk glides swiftly and chirps


package JavaAbstractClasses;

abstract class Bird {

    public void display() {
        fly();
        makeSound();
    }

    public abstract void fly();

    public abstract void makeSound();
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.print("Eagle soars high and ");
    }

    @Override
    public void makeSound() {
        System.out.println("screeches");
    }
}

class Hawk extends Bird {
    @Override
    public void fly() {
        System.out.print("Eagle glides swiftly and ");
    }

    @Override
    public void makeSound() {
        System.out.println("chirps");
    }
}

public class JavaAbstractClasses11 {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird hawk = new Hawk();
        eagle.display();
        hawk.display();
    }
}
