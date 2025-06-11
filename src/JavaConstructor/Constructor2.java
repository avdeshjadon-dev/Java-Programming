// ------------------- 2. Parameterized Constructor -------------------
//
// Write a Java program to create a class called "Dog" with instance variables
// name and color. Implement a parameterized constructor that takes name and color
// as parameters and initializes the instance variables. Print the values of the variables.
//
// ------------------- SAMPLE OUTPUT -------------------
// Name: Max
// Color: Brown

package JavaConstructor;

class Dog {
    private String name;
    private String colour;

    public Dog(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

}

public class Constructor2 {


    public static void main(String[] args) {
        Dog myDog = new Dog("Sheru", "Kala");
        System.out.println("Dog Name: " + myDog.getName());
        System.out.println("Dog Colour: " + myDog.getColour());


    }
}
