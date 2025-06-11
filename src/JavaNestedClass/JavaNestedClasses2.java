// ------------------- 2. Static Nested Class -------------------
//
// Write a Java program to create an outer class called "University"
// with a static nested class "Department". The Department class should have a
// method "displayInfo()" that prints the department name and the number of
// faculty members. Instantiate the Department class from the main method and
// call the "displayInfo()" method.
//
// ------------------- SAMPLE OUTPUT -------------------
// Department Name: Computer Science
// Number of Faculty Members: 25
//

package JavaNestedClass;

import java.util.Scanner;

class University {
    public static class Department {
        public static void displayInfo(String name, int num) {
            System.out.println("Department Name : " + name);
            System.out.println("Number of faculty members : " + num);
        }
    }
}

public class JavaNestedClasses2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the department name : ");
        String departmentName = sc.nextLine();
        System.out.print("Enter the number of faculty : ");
        int noOfFaculty = sc.nextInt();
        University.Department.displayInfo(departmentName, noOfFaculty);
        sc.close();
    }
}
