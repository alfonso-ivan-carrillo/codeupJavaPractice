public class Alias extends Person{

    private String alterEgo;

    public Alias (String name, String alterEgo){
        super(name);                    // uses name from Person class
        this.alterEgo = alterEgo;       // uses the field in Alias class
    }

    public String getName(){
        return alterEgo;                // uses the field in Alias class
    }

    public String getSecretIdentity(){
        return super.getName();         // uses the name field in Person class
    }

    public static void main(String[] args) {
        Alias kent = new Alias("clark", "superman");

        System.out.println(kent.name);          // returns clark - super(name)
        System.out.println(kent.alterEgo);      // returns this.alterego = alterego - superman - alterego
        System.out.println(kent.getName());     // returns superman - method returns alterego
        System.out.println(kent.getSecretIdentity()); // returns clar - super.getName()

    }
}
