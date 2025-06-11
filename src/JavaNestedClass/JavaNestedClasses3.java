// ------------------- 3. Local Class -------------------
//
// Write a Java program to create a class called "Car" with a method "startEngine()".
// Inside this method, define a local class "Engine" that has a method "run()".
// The "run()" method should print "Engine is running". Instantiate and call
// the "run()" method from within the "startEngine()" method.
//
// ------------------- SAMPLE OUTPUT -------------------
// Engine is running


package JavaNestedClass;

class Car1 {
    public void startEngine() {
        class Engine {
            public void run() {
                System.out.println("Engine is running -----");
            }
        }
        Engine engine = new Engine();
        engine.run();
    }
}

public class JavaNestedClasses3 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.startEngine();
    }
}
