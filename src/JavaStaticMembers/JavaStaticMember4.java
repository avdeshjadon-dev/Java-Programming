// ------------------- 4. Static Final Variables -------------------
//
// Write a Java program to create a class called "Constants" with a static final
// variable 'PI' initialized to 3.14159. Create a method to calculate the area
// of a circle given its radius, using the 'PI' constant. Demonstrate the method
// in the main method.
//
// ------------------- SAMPLE OUTPUT -------------------
// Area of the circle: 78.53975


package JavaStaticMembers;

import java.util.Scanner;

class Constants {
    public static final double PI = 3.14159;

    public static double calculateArea(double rad) {
        double ans;
        ans = PI * rad * rad;
        return ans;

    }
}

public class JavaStaticMember4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        double rad = sc.nextDouble();
        double area = Constants.calculateArea(rad);
        System.out.println("Area : " + area);
    }
}
