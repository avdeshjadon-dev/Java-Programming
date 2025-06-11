// ------------------- 7. Abstract Class Vehicle -------------------
//
// Write a Java program to create an abstract class Vehicle with abstract methods
// startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend
// the Vehicle class and implement the respective methods to start and stop the
// engines for each vehicle type.
//
// ------------------- SAMPLE OUTPUT -------------------
// Car engine started
// Car engine stopped
// Motorcycle engine started
// Motorcycle engine stopped


package JavaAbstractClasses;

abstract class Vehicle {
    public void display() {
        startEngine();
        stopEngine();
    }

    public abstract void startEngine();

    public abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car is stopping");
    }
}

class MotorCycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle is stopping");
    }
}

public class JavaAbstractClasses7 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new MotorCycle();
        car.display();
        motorcycle.display();
    }
}
