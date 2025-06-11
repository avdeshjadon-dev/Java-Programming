// ------------------- 6. Static Nested Class and Static Methods -------------------
//
// Write a Java program to create an outer class called 'MathUtil' with a static
// nested class 'Calculator'. The Calculator class should have a static method
// 'add(int a, int b)' that returns the sum of a and b. Call the add() method
// from the main method.
//
// ------------------- SAMPLE OUTPUT -------------------
// Sum: 15


package JavaNestedClass;

class MathUtil {
    public static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }
}

public class JavaNestedClasses6 {
    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();
        MathUtil.Calculator calculator = new MathUtil.Calculator();
        System.out.println("Sum is  : " + calculator.add(5, 6));
    }
}
