// ------------------- 10. Employee Class Hierarchy -------------------
//
// Write a Java program that creates a class hierarchy for employees of a company.
// The base class should be Employee, with subclasses Manager, Developer, and Programmer.
// Each subclass should have properties such as name, address, salary, and job title.
// Implement methods for calculating bonuses, generating performance reports, and managing projects.
//
// ------------------- SAMPLE OUTPUT -------------------
// Manager: Name - Amrita, Address - 123 Main St, Salary - 90000, Job Title - Project Manager
// Bonus: 9000
// Generating performance report...
// Managing projects...
//
// Developer: Name - Amrita, Address - 456 Oak St, Salary - 80000, Job Title - Software Developer
// Bonus: 8000
// Generating performance report...
// Managing projects...
//
// Programmer: Name - Amrita, Address - 789 Pine St, Salary - 70000, Job Title - Programmer
// Bonus: 7000
// Generating performance report...
// Managing projects...


package JavaInheritance;

class Employee2 {
    private String name;
    private String address;
    private double salary;
    private String job_title;

    Employee2(String name, String address, double salary, String job_title) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.job_title = job_title;
    }

    public void display() {
        System.out.println(getClass().getSimpleName() + ": Name- " + getName() + ", Address- " + getAddress() + ", Salary- " + getSalary() + ", Job Title- " + getJob_title());
        System.out.println("Bonus: " + bonus());
        genratepr();
        System.out.println();
        manageproject();
        System.out.println();
        System.out.println();
    }

    public double bonus() {
        return salary * 0.10;
    }

    public void genratepr() {
        System.out.printf("Generating the performance report -----");
    }

    public void manageproject() {
        System.out.printf("Managing Project -----");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJob_title() {
        return job_title;
    }


}

class Manager extends Employee2 {
    Manager(String name, String address, double salary, String job_title) {
        super(name, address, salary, job_title);
    }
}

class Developer extends Employee2 {
    Developer(String name, String address, double salary, String job_title) {
        super(name, address, salary, job_title);
    }
}

class Programmer extends Employee2 {
    Programmer(String name, String address, double salary, String job_title) {
        super(name, address, salary, job_title);
    }
}

public class JavaInheritance10 {
    public static void main(String[] args) {
        Manager manager = new Manager("Amrita", "Shiv coloney, Radaur", 87000, "Manager");
        Developer developer = new Developer("Avdesh", "Jatpura Agra", 736477.32, "Developer");
        Programmer programmer = new Programmer("Sachin", "Garreb gali rohtak", 646443.33, "programmer");
        manager.display();
        developer.display();
        programmer.display();
    }
}

