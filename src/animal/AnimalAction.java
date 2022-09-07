package animal;

public class AnimalAction {


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
