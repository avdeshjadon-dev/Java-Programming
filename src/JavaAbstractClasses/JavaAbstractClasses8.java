// ------------------- 8. Abstract Class Person -------------------
//
// Write a Java program to create an abstract class Person with abstract methods
// eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the
// Person class and implement the respective methods to describe how each person
// eats and exercises.
//
// ------------------- SAMPLE OUTPUT -------------------
// Athlete eats healthy and exercises daily
// LazyPerson eats junk food and rarely exercises


package JavaAbstractClasses;

abstract class Person {
    public void display() {
        eat();
        sleep();
    }

    public abstract void eat();

    public abstract void sleep();
}

class Athelete extends Person {
    @Override
    public void eat() {
        System.out.print("Athlete eats healthy and ");
    }

    @Override
    public void sleep() {
        System.out.println("exercise daily");
    }
}

class LazyPerson extends Person {
    @Override
    public void eat() {
        System.out.print("LazyPerson eats junk food and ");
    }

    @Override
    public void sleep() {
        System.out.println("rarely exercises");
    }
}

public class JavaAbstractClasses8 {
    public static void main(String[] args) {
        Person athelete = new Athelete();
        Person lazyperson = new LazyPerson();
        athelete.display();
        lazyperson.display();
    }
}
