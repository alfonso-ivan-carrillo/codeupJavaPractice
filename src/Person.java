public class Person {

    public String firstName;
    public String lastName;

    protected String name; // instance property - because no static keyword is present

    private int age;
    public static long worldPopulation = 7_500_000_000L; // class property - because of the static keyword is used

    public Person(String name) {
        this.name = name;
    }
    public Person(String firstName, String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    // the Person constructor
    public Person() {
        System.out.println("A Person is being created!");
    }
    // A constructor is a special method that is called when an object is created.
    // A constructor has the same name as the class and does not define a return type.
    // Constructors, like any other method, can accept arguments and be overloaded.
    // A common use case for constructors is to set, or provide default values for, an object's fields
    public String sayHello(){
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {

        // We said that fields can belong either to a class or an object.
        // Instance fields: fields that belong to an instance (as opposed to a class).
        // What this means is that each object can have different values for their instance fields.
        // For example, each person can have a different first name and last name.
        Person ethan = new Person();
        ethan.firstName = "Ethan";      // instance fields
        ethan.lastName = "Carrillo";    // instance fields
        // The above code will print out:
        //  *** A Person is being created!  ***
        // because the constructor is called whenever we use the new keyword to create an instance of the class

        //A Person is being created!
        System.out.println(ethan.sayHello());

        Person kathy = new Person();
        kathy.firstName = "Kathy";      // instance fields
        kathy.lastName = "Maddocks";    // instance fields
        kathy.age = 45;
        System.out.println("kathy's age: "+ kathy.age);
        // The above code will print out:
        //  A Person is being created!
        // because the constructor is called whenever we use the new keyword to create an instance of the class

        System.out.println(kathy.sayHello());

        // In contrast to instance fields are static fields, those that belong to a class as a whole.
        // Static fields are accessible through the class itself. In other words,
        // they are accessible without creating an instance of the class.
        System.out.println(Math.PI);

        // Notice that we didn't need to write any code that instantiates the Math class,
        // we simply add a . after the class name and refer to the static field.

        // Static fields are defined with the static keyword, and are shared by all instances of the class,
        // meaning that static fields should not be anything that is supposed to be unique to instances of the class.
        // Instead, they should contain information that all instances will use, or methods and
        // fields that are meant to be accessed only statically.

        // Static fields can be referenced by instance methods. But instance fields cannot be referenced in a static context.

        Person theBestDrummerAlive = new Person();
        theBestDrummerAlive.name = "Neil Peart";

        Person.worldPopulation += 1; // accessing a static property

        System.out.println(Person.worldPopulation); // 7500000001

        // technically this will work, but it is usually better to reference
        // static properties through the class, not instances
        System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001

        // DONT DO THIS, it will not compile
        // System.out.println(Person.name);

        // Each person has a different name, but the world population is the same for all people.
        // You cannot access an instance variable in a static context (only individual people have names, not people in general).


    }
}
