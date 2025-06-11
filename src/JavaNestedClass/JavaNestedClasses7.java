// ------------------- 7. Local Class Accessing Local Variables -------------------
//
// Write a Java program to create a class called "House" with a method "calculateArea()".
// Inside this method, define a local class "Room" with a method "getArea()" that calculates
// and returns the area of the room (length * width). Instantiate the Room class and call
// the "getArea()" method from within "calculateArea()".
//
// ------------------- SAMPLE OUTPUT -------------------
// Area of the room: 200 square units


package JavaNestedClass;

class House {
    public void calculateArea() {
        final double length = 34.33;
        final double breadth = 7.00;
        class Room {
            public double getArea() {
                return length * breadth;
            }
        }
        Room room = new Room();
        double area = room.getArea();
        System.out.println("Area : " + area);
    }
}

public class JavaNestedClasses7 {
    public static void main(String[] args) {
        House house = new House();
        house.calculateArea();
    }
}
