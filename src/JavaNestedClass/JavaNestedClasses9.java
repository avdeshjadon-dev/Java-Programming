// ------------------- 9. Inner Class with Constructor -------------------
//
// Write a Java program to create an outer class called "Person" with an inner class "Address".
// The Address class should have a constructor that takes parameters "city" and "state".
// Create an instance of Address from the Person class and print the address details.
//
// ------------------- SAMPLE OUTPUT -------------------
// City: New York
// State: New York


package JavaNestedClass;

class Person {
    String city;
    String state;

    class Address {
        Address(String city, String state) {
            Person.this.city = city;
            Person.this.state = state;
        }
    }

    void display() {
        System.out.println("City : " + city);
        System.out.println("Address : " + state);
    }
}

public class JavaNestedClasses9 {
    public static void main(String[] args) {
        Person person = new Person();
        Person.Address address = person.new Address("Agra", "UttarPradesh");
        person.display();
    }
}
