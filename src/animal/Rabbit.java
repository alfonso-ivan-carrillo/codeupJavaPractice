package animal;

public class Rabbit implements Prey{
    public String name;

    public Rabbit() {
    }

    public Rabbit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // A class that implements an interface must provide an implementation for each method defined by the interface.

    // RABBIT Class implements the PREDATOR Abstract Flee Method
    public void flee(){
        System.out.println("The rabbit is fleeing!");
    }
}
