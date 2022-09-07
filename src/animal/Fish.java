package animal;

public class Fish implements Prey, Predator{

    // FISH Class implements the PREDATOR Abstract HUNT() Method
    @Override
    public void hunt() {
        System.out.println("This fish is hunting smaller fish.");
    }

    // FISH Class implements the PREY Abstract FLEE() Method
    @Override
    public void flee() {
        System.out.println("This fish is fleeing from bigger fish.");
    }
}
