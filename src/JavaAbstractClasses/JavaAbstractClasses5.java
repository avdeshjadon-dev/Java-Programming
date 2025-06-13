// ------------------- 🔹 5. Abstract Class - Employee 🔹 -------------------
//
// 💡 Write a Java program to create an abstract class `Employee` with two abstract methods:
//     - `calculateSalary()`
//     - `displayInfo()`
//
// Then create two subclasses that extend `Employee`:
//   ➤ `Manager`    - Salary: 80000, Info: Name and Department
//   ➤ `Programmer` - Salary: 60000, Info: Name and Programming Language
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Manager Salary: 80000
// Manager Info: Name: Alice, Department: Sales
//
// Programmer Salary: 60000
// Programmer Info: Name: Bob, Programming Language: Java

package JavaAbstractClasses;

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract void calculateSalary();

    public abstract void displayInfo();
}

class Manager extends Employee {
    private String department;
    private int salary;

    public Manager(String name, String department) {
        super(name);
        this.department = department;
    }

    @Override
    public void calculateSalary() {
        this.salary = 80000;
        System.out.println("Manager Salary: " + salary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager Info: Name: " + name + ", Department: " + department);
    }
}

class Programmer extends Employee {
    private String programmingLanguage;
    private int salary;

    public Programmer(String name, String programmingLanguage) {
        super(name);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void calculateSalary() {
        this.salary = 60000;
        System.out.println("Programmer Salary: " + salary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer Info: Name: " + name + ", Programming Language: " + programmingLanguage);
    }
}

public class JavaAbstractClasses5 {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", "Sales");
        Employee programmer = new Programmer("Bob", "Java");

        manager.calculateSalary();
        manager.displayInfo();

        System.out.println();

        programmer.calculateSalary();
        programmer.displayInfo();
    }
}
