// ------------------- 6. Method Overriding -------------------
//
// Write a Java program to create a class called Animal with a method named
// move(). Create a subclass called Cheetah that overrides the move() method
// to run.
//
// ------------------- SAMPLE OUTPUT -------------------
// The cheetah runs swiftly

package JavaInheritance;
class Animal1{
    void move(){
        System.out.println("I am moving");
    }
}
class Cheetah extends Animal1{
    @Override
    void move() {
        System.out.println("I am Running");
    }
}
public class JavaInheritance6 {
    public static void main(String[] args) {
        Cheetah cheetah=new Cheetah();
        cheetah.move();
    }
}
