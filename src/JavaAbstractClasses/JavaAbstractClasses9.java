// ------------------- 9. Abstract Class Instrument -------------------
//
// Write a Java program to create an abstract class Instrument with abstract methods
// play() and tune(). Create subclasses Glockenspiel and Violin that extend the
// Instrument class and implement the respective methods to play and tune each instrument.
//
// ------------------- SAMPLE OUTPUT -------------------
// Glockenspiel is being played and tuned
// Violin is being played and tuned


package JavaAbstractClasses;

abstract class Instrument {

    public void display() {
        play();
        tune();
    }

    public abstract void play();

    public abstract void tune();
}

class Glockenspiel extends Instrument {
    @Override
    public void play() {
        System.out.print("Violin is being played and ");
    }

    @Override
    public void tune() {
        System.out.println("tuned");
    }
}

class Violin extends Instrument {
    @Override
    public void play() {
        System.out.print("Violin is being played and ");
    }

    @Override
    public void tune() {
        System.out.println("tuned");
    }
}

public class JavaAbstractClasses9 {
    public static void main(String[] args) {
        Instrument glockenspiel = new Glockenspiel();
        Instrument violin = new Violin();
        glockenspiel.display();
        violin.display();
    }
}
