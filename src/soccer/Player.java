package soccer;

abstract class Player extends Team{

    // abstract class extends an abstract class? then the class extending player such as midfield, forwards
    // defender, goalie classes, must also must Implement the abstract methods of Player and Team

    // ABSTRACT CLASS is a class that can serve as a superclass, but cannot be directly instantiated. A class is defined
    // as abstract by using the ABSTRACT KEYWORD in the class definition. Abstract classes can define abstract methods,
    // which are methods with nobody, they only provide information about the method name, return type, and parameters.

    // Any class that inherits from an abstract class MUST DEFINE ALL ABSTRACT METHODS, or itself be abstract. Another
    // way to say this is that to instantiate a class, it must not be abstract, and have no abstract methods.
    // We would use an abstract class when we want to FORCE SUBCLASSES to provide a UNIQUE IMPLEMENTATION for a method.

    // An ABSTRACT CLASS is used to represent something that needs to be extended.
    protected String name;
    protected String position;

    public int number;

    public Player(){
    }
    public Player(String name){
        this.name = name;
    }
    public Player(String name, String position){
        this.name = name;
        this.position = position;
    }
    public Player(String name, String position, int number){
        this.name = name;
        this.position = position;
        this.number =number;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public int getNumber() { return  number; }

    public void setNumber(int number) {this.number = number; }

    // declare an ABSTRACT METHOD by using the Keyword Abstract
    // you must implement the methods in the Class that are Extending the abstract class
    public abstract String play();
    public abstract String passBall();

    public abstract String shootBall();

    public abstract String cornerBall();

}
