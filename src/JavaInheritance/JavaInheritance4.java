// ------------------- 4. Method Overriding and New Method -------------------
//
// Write a Java program to create a class called Employee with methods called
// work() and getSalary(). Create a subclass called HRManager that overrides
// the work() method and adds a new method called addEmployee().
//
// ------------------- SAMPLE OUTPUT -------------------
// HR Manager is working
// Adding a new employee
// Salary: 50000


package JavaInheritance;

class Employee {
    private int salary;

    void work() {
        System.out.println("Employee is Working : ");
    }

    Employee(int salary) {
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }
}

class HRmanager extends Employee {
    private int managerSalary;

    HRmanager(int salary, int managerSalary) {
        super(salary);
        this.managerSalary = managerSalary;
    }

    @Override
    void work() {
        System.out.println("Manager is managing : ");
    }

    void addEmployee() {
        System.out.println("Adding new employees :");
    }

    void bothWork() {
        super.work();
    }

    int getManagerSalary() {
        return managerSalary;
    }


}

public class JavaInheritance4 {
    public static void main(String[] args) {
        HRmanager hRmanager = new HRmanager(6000, 15000);
        hRmanager.bothWork();
        int sal = hRmanager.getSalary();
        System.out.println("Salary : " + sal);
        hRmanager.work();
        int sal1 = hRmanager.getManagerSalary();
        System.out.println("Salary: " + sal1);
        hRmanager.addEmployee();
    }
}
