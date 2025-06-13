// ------------------- 🔹Static Method for ID Generation -------------------
//
// 💡 Write a Java program to demonstrate a static method used for generating unique IDs.
//
// Create a class `IDGenerator` with a static field `nextID`, initially set to 1.
// Implement a static method `generateID()` that returns the current value of `nextID` and then increments it.
//
// In the main method, call the `generateID()` method multiple times to simulate unique ID generation.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// GenerateID : 1
// GenerateID : 2
// GenerateID : 3


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
