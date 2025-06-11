// ------------------- 5. Abstract Class Employee -------------------
//
// Write a Java program to create an abstract class Employee with abstract methods
// calculateSalary() and displayInfo(). Create subclasses Manager and Programmer
// that extend the Employee class and implement the respective methods to calculate
// salary and display information for each role.
//
// ------------------- SAMPLE OUTPUT -------------------
// Manager Salary: 80000
// Manager Info: Name: Alice, Department: Sales
//
// Programmer Salary: 60000
// Programmer Info: Name: Bob, Programming Language: Java


package JavaAbstractClasses;
abstract class Employee{
    protected String name;
    protected String department;

    public abstract void calculateSalary();
    public abstract void displayInfo();
}
class Manager extends Employee{
    @Override
    public void calculateSalary() {
    }

    @Override
    public void displayInfo() {
    }
}
class Programmer extends Employee{
    @Override
    public void calculateSalary() {
    }

    @Override
    public void displayInfo() {
    }
}
public class JavaAbstractClasses5 {
    public static void main(String[] args) {

    }
}
