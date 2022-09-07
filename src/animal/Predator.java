package animal;

public interface Predator {

    // Interface with one abstract method
    public void hunt();
    // The name of the interface usually contains information about what an object does, or what it is capable of doing.
    // The methods, along with the types of the parameters and return value, convey what the object is doing, but not
    // how (the implementation).

    public void hunted();
}
