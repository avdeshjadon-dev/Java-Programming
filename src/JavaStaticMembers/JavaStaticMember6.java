// ------------------- 6. Static Method with Static Variable -------------------
//
//  Write a Java program to create a class called "IDGenerator" with a static variable
// 'nextID' and a static method "generateID()" that returns the next ID and increments
// 'nextID'. Demonstrate the usage of generateID in the main method.
//
// ------------------- SAMPLE OUTPUT -------------------
// Generated ID: 1
// Generated ID: 2
// Generated ID: 3


package JavaStaticMembers;

class IDGenerator {
    private static int nextID = 1;

    public static int generateID() {
        return nextID++;
    }
}

public class JavaStaticMember6 {

    public static void main(String[] args) {
        System.out.println("GenerateID : " + IDGenerator.generateID());
        System.out.println("GenerateID : " + IDGenerator.generateID());
        System.out.println("GenerateID : " + IDGenerator.generateID());
    }
}
