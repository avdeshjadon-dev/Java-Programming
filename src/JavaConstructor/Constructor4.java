// ------------------- 4. Chaining Constructors -------------------
//
// Write a Java program to create a class called "Student" with instance variables
// studentId, studentName, and grade. Implement:
//   - A default constructor
//   - A parameterized constructor taking all three variables
// Use constructor chaining to initialize the variables. Print the values of the variables.
//
// ------------------- SAMPLE OUTPUT -------------------
// Default Constructor:
// Student ID: 0
// Student Name: Unknown
// Grade: Not Assigned
//
// Parameterized Constructor:
// Student ID: 101
// Student Name: Alice
// Grade: A

package JavaConstructor;

class Student {
    int studentId;
    String studentName;
    char grade;

    public Student() {
        // yaha par mai define bhi kar sakata hu

//            this.studentId=0;
//            this.studentName="Payal";
//            this.grade='D';

        this(9, "Priya", 'O');  //aise bhi value assign kar sakate hai

    }

    public Student(int studentId, String studentName, char grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
}

public class Constructor4 {


    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Student ID : " + student1.studentId);
        System.out.println("Student Name : " + student1.studentName);
        System.out.println("Grade : " + student1.grade);

        Student student2 = new Student(12319278, "Avdesh Jadon", 'A');
        System.out.println("Student ID : " + student2.studentId);
        System.out.println("Student Name : " + student2.studentName);
        System.out.println("Grade : " + student2.grade);


    }
}
