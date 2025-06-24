// ------------------- 🔹 1. Method Overriding 🔹 -------------------
//
// 💡 Write a Java program to create a class called `Animal` with a method called:
//     - `makeSound()`
//
// Then create a subclass called `Cat` that overrides the `makeSound()` method
// to print a cat-specific message.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Yaha par maine override kar diya hai:


package JavaInheritance;

class Animal {
    void makeSound() {
        System.out.println("There is a sound :");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Yaha par maine override kar diya hai:");
    }
}

public class JavaInheritance1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}
