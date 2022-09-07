package vehicles;

public class Drive {

    public static void main(String[] args) {

        // ABSTRACT = abstract classes cannot be instantiated, but they can have a SUBCLASS
        //            abstract methods are declared without an implementation

        // Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.go();
    }
}
