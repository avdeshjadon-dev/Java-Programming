// ------------------- 1. Inner Class -------------------
//
// Write a Java program to create an outer class called "Computer"
// with an inner class "Processor". The Processor class should have a
// method "displayDetails()" that prints the details of the processor
// (e.g., brand and speed). Create an instance of Processor from the
// Computer class and call the "displayDetails()" method.
//
// ------------------- SAMPLE OUTPUT -------------------
// Processor Brand: Intel
// Processor Speed: 3.6 GHz


package JavaNestedClass;

class Computer {
    public class Processor {
        public void displayDetails() {
            System.out.println("Processor Brand : intel");
            System.out.println("Processor Speed : 3.6 GHz");
        }
    }

    public void processorDetails() {
        Processor processor = new Processor();
        processor.displayDetails();
    }

}

public class JavaNestedClasses1 {


    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.processorDetails();
    }
}
