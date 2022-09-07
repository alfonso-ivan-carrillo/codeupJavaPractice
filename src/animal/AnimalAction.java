package animal;

public class AnimalAction {
    // An INTERFACE is special case for an ABSTRACT CLASS.
    // An INTERFACE class follows these rules:
    // 1. All methods are public and abstract
    // 2. All properties are public static and final.
    //  Example: public int age = 12; has to be defined since it will be final.
    //  Also all properties defined this way will be applied to all class that use or refer to property.
    // 3. No static methods

    // Interfaces are used to define the behaviour of our objects, and thus are typically only used to define methods,
    // and occasionally class constants (public static properties). Interfaces allow us to define the way that our
    // objects interact with the rest of our application.

    // Using Main Method to compile and run code
    public static void main(String[] args) {

        Rabbit roger = new Rabbit();
        roger.flee();

        Hawk hawkins = new Hawk();
        hawkins.hunt();

        Fish nemo = new Fish();
        nemo.flee();
        nemo.hunt();
    }
}
