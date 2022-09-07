package animal;

public class Hawk implements Predator{
    // A class that implements an interface must provide an implementation for each method defined by the interface.

    // HAWK Class implements the PREDATOR Abstract Hunt Method
    public void hunt(){
        System.out.println("The hawk is hunting!");
    }

    public void hunted(){
        System.out.println("The hawk is being hunted!");
    }

}
