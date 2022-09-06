package soccer;

public class Game {

    public static void main(String[] args) {

        // Player player = new Player();
        // Will not compile, Player Class is defined as an Abstract and cannot be directly instantiated.

        Midfield midfield = new Midfield();
        Forward forward = new Forward();
    }
}
