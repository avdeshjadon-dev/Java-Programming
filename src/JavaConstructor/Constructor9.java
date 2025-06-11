// ------------------- 9. Constructor with Array Initialization -------------------
//
// Create a class called "Classroom" with instance variables:
//   - className (String)
//   - students (String array)
// Implement a parameterized constructor to initialize these variables.
// Print the values of the variables.
//
// ------------------- SAMPLE OUTPUT -------------------
// Class Name: Java 101
// Students: [Alice, Bob, Charlie]


package OOPS;

class Classroom {
    private String className;
    private String[] students;

    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }

    public String getClassName() {
        return className;
    }

    public String[] getStudents() {
        return students;
    }

    public void display() {
        System.out.println("ClassRoom : " + className);
        System.out.print("Students : ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
    }
}

public class Constructor9 {


    public static void main(String[] args) {
        String[] studentArray = {"Avdesh", "Aman", "Suman"};
        Classroom classRoom = new Classroom("pappupasshogaya 420", studentArray);
        classRoom.display();
    }
}
