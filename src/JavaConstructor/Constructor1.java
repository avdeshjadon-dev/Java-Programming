// ------------------- 1. Default Constructor -------------------
//
// Write a Java program to create a class called "Cat" with instance variables
// name and age. Implement a default constructor that initializes the name to
// "Unknown" and the age to 0. Print the values of the variables.
//
// ------------------- SAMPLE OUTPUT -------------------
// Name: Unknown
// Age: 0


package JavaConstructor;

class Cat {
    private String name;
    private int age;

    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.println("Cat Name : " + myCat.getName());
        System.out.println("Cat Age : " + myCat.getAge());

    }
}
