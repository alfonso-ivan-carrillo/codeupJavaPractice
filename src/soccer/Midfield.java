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

    public String passBall(){
        return "pass to advance the ball up the field or retain possession";
    }

    public String shootBall(){
        return "if no pass option available and within range go for goal";
    }

    public String cornerBall(){
        return "get to player in good position to score";
    }

}

class Forward extends Player{
    public String play(){
        return "score goal";
    }
    //the Midfield Class MUST define a PLAY() method because it inherits from the Player and is not defined as an Abstract.

    public String passBall(){
        return "if no shot available, pass to player with opportunity to score";
    }

    public String shootBall(){
        return "if within range, go for goal";
    }

    public String cornerBall(){
        return "go for goal";
    }
}

class Defender extends Player{

    public String play(){
        return "stop attack";
    }

    public String passBall(){
        return "build from the back";
    }

    public String shootBall(){
        return "if a rare opportunity presents itself shoot";
    }

    public String cornerBall(){
        return "header to the goal";
    }
}

class Goalie extends Player{
    public String play(){
        return "stop ball";
    }
    public String passBall(){
        return "begin buildup";
    }

    public String shootBall(){
        return "stop ball";
    }

    public String cornerBall(){
        return "stop ball";
    }
}
