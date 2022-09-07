package soccer;

class Midfield extends Player{

    public String play(){
        return "distribute ball";
    }
    // the Midfield Class MUST define a PLAY() method because it inherits from the Player and is not defined as an Abstract.

    // By inheriting from an Abstract Class (player in this case), we ensure each subclass has full access to the constructor,
    // the getName() and getPosition() methods from the Player Class and since they are inheriting from an Abstract Class
    // we force the Midfield and Forward Class to IMPLEMENT a Unique Method of PLAY(), and prevent duplicating code that
    // deals with handling player names and position.

}

class Forward extends Player{
    public String play(){
        return "score goal";
    }
    //the Midfield Class MUST define a PLAY() method because it inherits from the Player and is not defined as an Abstract.
}
