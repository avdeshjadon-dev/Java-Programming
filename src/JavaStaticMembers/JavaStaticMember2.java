// ------------------- 2. Static Methods -------------------
//
// Write a Java program to create a class called "MathUtility" with a static method
// add that takes two integers and returns their sum. Demonstrate the usage of
// this static method in the main method without creating an instance of "MathUtility".
//
// ------------------- SAMPLE OUTPUT -------------------
// Sum: 15


package JavaStaticMembers;

class MathUtility {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class JavaStaticMember2 {

    public static void main(String[] args) {
        int sum = MathUtility.add(4, 5);
        System.out.println("the sum of two numbers is  : " + sum);

    }

}
