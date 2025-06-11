// ------------------- 3. Interface with Multiple Implementations -------------------
//
// Write a Java program to create an interface Flyable with a method called fly_obj().
// Create three classes Spacecraft, Airplane, and Helicopter that implement the
// Flyable interface. Implement the fly_obj() method for each of the three classes.
//
// ------------------- SAMPLE OUTPUT -------------------
// Spacecraft is flying in space
// Airplane is flying in the sky
// Helicopter is hovering above ground


package JavaInterface;
interface Flyable {
    void fly_obj();
    default void dispaly() {
        fly_obj();
    }
}
class SpaceCraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space");
    }
}
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky");
    }
}
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is hovering above ground");
    }
}
public class JavaInterface3 {
    public static void main(String[] args) {
        SpaceCraft spaceCraft = new SpaceCraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();
        spaceCraft.dispaly(); ;
        airplane.dispaly();
        helicopter.dispaly();
    }
}
