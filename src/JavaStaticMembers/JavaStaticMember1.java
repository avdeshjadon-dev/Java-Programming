// ------------------- 1. Static Variables -------------------
//
// Write a Java program to create a class called "Counter"
// with a static variable count. Implement a constructor
// that increments count every time an object is created.
// Print the value of count after creating several objects.
//
// ------------------- SAMPLE OUTPUT -------------------
// Total objects created: 5

package JavaStaticMembers;

class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class JavaStaticMember1 {


    public static void main(String[] args) {
        Counter myCount1 = new Counter();
        Counter myCount2 = new Counter();
        Counter myCount3 = new Counter();
        System.out.println("Count : " + Counter.getCount());
    }
}
