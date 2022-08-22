public class Player {
    private String name;

    public Player() {
        System.out.println("Player created!");
    }

    public Player (String name){
        this.name = name;
        System.out.println("Opt 2 constructor used");
    }
    // The this keyword provides us a way to refer to the current instance. You can think of this as saying "this object".
    // You can only use the this keyword inside of an instance method, as it is an error to do so elsewhere.

    // in the constructor, the this keyword lets us unambiguously refer to the name field of the Player object
    // that is being created, even though we already have a variable named name in scope.
    public String sayHello(){
        return String.format("%s says hello!", this.name);
    }


    public static void main(String[] args) {
        Player one = new Player();  // will print out "player created" because constructor used to create instance.
        one.name = "Player One";
        System.out.println(one.name);
        System.out.println(one.sayHello());

        System.out.println("------------");

        Player two = new Player("playerTwo");  // will print "Opt 2 constructor used" because of constructor used
        System.out.println(two.name);
        System.out.println(two.sayHello());

    }
}
