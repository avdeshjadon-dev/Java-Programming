// ------------------- 2. Method Overriding -------------------
//
// Write a Java program to create a class called Vehicle with a method called
// drive(). Create a subclass called Car that overrides the drive() method to
// print "Repairing a car".
//
// ------------------- SAMPLE OUTPUT -------------------
// Repairing a car


package JavaInheritance;
class Vehicle{
    void drive(){
        System.out.println("You are driving a car");
    }
}
class Mechanic extends Vehicle{
    @Override
    void drive() {
        System.out.println("Reparing a car");
    }
}
public class JavaInheritance2 {
    public static void main(String[] args) {
        Mechanic mechanic=new Mechanic();
        mechanic.drive();
    }
}
