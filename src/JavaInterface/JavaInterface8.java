// ------------------- 8. Playable Interface with Multiple Implementations -------------------
//
// Write a Java program to create an interface Playable with a method play() that
// takes no arguments and returns void. Create three classes Football, Volleyball,
// and Basketball that implement the Playable interface and override the play()
// method to play the respective sports.
//
// ------------------- SAMPLE OUTPUT -------------------
// Playing Football
// Playing Volleyball
// Playing Basketball


package JavaInterface;
interface Playable {
    void play();
}
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}
public class JavaInterface8 {
    public static void main(String[] args) {
        Football football = new Football();
        Volleyball volleyball = new Volleyball();
        Basketball basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();
    }
}
