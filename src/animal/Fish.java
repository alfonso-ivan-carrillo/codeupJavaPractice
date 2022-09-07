package animal;

public class Fish implements Prey, Predator{

    // A class that implements an interface must provide an implementation for each method defined by the interface.

    // FISH Class implements the PREDATOR Abstract HUNT() Method
    @Override
    public void hunt() {
        System.out.println("This fish is hunting smaller fish.");
    }

    public void hunted(){
        System.out.println("The fish is being hunted!");
    }

    // FISH Class implements the PREY Abstract FLEE() Method
    @Override
    public void flee() {
        System.out.println("This fish is fleeing from bigger fish.");
    }
}
