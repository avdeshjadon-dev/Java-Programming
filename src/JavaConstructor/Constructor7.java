// ------------------- 7. Constructor with Default Values -------------------
//
// Create a class called "Car" with instance variables make, model, and year.
// Implement a parameterized constructor that:
//   - Initializes these variables
//   - Assigns default values if not provided
// Print the values of the variables.
//
// ------------------- SAMPLE OUTPUT -------------------
// Car 1 (with values):
// Make: Toyota
// Model: Corolla
// Year: 2020
//
// Car 2 (with default values):
// Make: Unknown
// Model: Unknown
// Year: 2022


package JavaConstructor;

class Car {
    private String make;
    private String model;
    int year;

    public Car(String make, String model, int year) {
        if (make == null || make.isEmpty()) {
            this.make = "Unknown Make";
        } else {
            this.make = make;
        }
        if (model == null || model.isEmpty()) {
            this.model = "Unkonown Model";
        } else {
            this.model = model;
        }
        if (year < 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

public class Constructor7 {

    public static void main(String[] args) {
        // unfield data entries or wrong entries
        Car myCar1 = new Car("", "", -7);
        System.out.println("Make : " + myCar1.getMake());
        System.out.println("Model : " + myCar1.getModel());
        System.out.println("Year : " + myCar1.getYear());

        //second object creation with proper values
        Car myCar2 = new Car("Toyota", "Corolla", 2022);
        System.out.println("Make : " + myCar2.getMake());
        System.out.println("Model : " + myCar2.getModel());
        System.out.println("Year : " + myCar2.getYear());


    }
}
