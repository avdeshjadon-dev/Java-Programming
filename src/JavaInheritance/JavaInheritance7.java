// ------------------- 7. Method Overriding and New Method -------------------
//
// Write a Java program to create a class known as Person with methods called
// getFirstName() and getLastName(). Create a subclass called Employee that adds
// a new method named getEmployeeId() and overrides the getLastName() method to
// include the employee's job title.
//
// ------------------- SAMPLE OUTPUT -------------------
// First Name: Amrita
// Last Name: Ghatoye - Software Engineer
// Employee ID: E12345

package JavaInheritance;

class Person {
    private String fname;
    private String lname;

    Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    String getFirstName() {
        return fname;
    }

    String getLastName() {
        return lname;
    }
}

class Employee1 extends Person {
    private String employeeId;
    private String jobTitle;

    Employee1(String fname, String lname, String employeeId, String jobTitle) {
        super(fname, lname);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    String getEmployeeId() {
        return employeeId;
    }

    @Override
    String getLastName() {
        return super.getLastName() + " - " + jobTitle;
    }
}

public class JavaInheritance7 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1("Amrita", "Ghatoye", "E12345", "Software Engineer");

        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());

    }
}
