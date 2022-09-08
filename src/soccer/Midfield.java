package soccer;

class Midfield extends Player{

    public Midfield() {
    }

    public Midfield(String name) {
        super(name);
    }

    public Midfield(String name, String position) {
        super(name, position);
    }

    public Midfield(String name, String position, int number) {
        super(name, position, number);
    }

    // the play(), passBall(), shootBall() and cornerBall() are abstract methods from the player class and each
    // extending class (midfield, forward, etc) must implement its own version of the method

    // Implementation of Abstract Methods from the Player Class
    public String play(){
        return "Player Core Play: distribute ball";
    }
    // the Midfield Class MUST define a PLAY() method because it inherits from the Player and is not defined as an Abstract.

    // By inheriting from an Abstract Class (player in this case), we ensure each subclass has full access to the constructor,
    // the getName() and getPosition() methods from the Player Class and since they are inheriting from an Abstract Class
    // we force the Midfield and Forward Class to IMPLEMENT a Unique Method of PLAY(), and prevent duplicating code that
    // deals with handling player names and position.

    public String passBall(){
        return "Pass Ball: pass to advance the ball up the field or retain possession";
    }

    public String shootBall(){
        return "Shoot Ball: if no pass option available and within range go for goal";
    }

    public String cornerBall(){
        return "Corner Ball: get to player in good position to score";
    }

    // Abstract Class implementation from the Abstract Team Class
    public String teamChant() {
        return "hey";
    }
    public String teamColors(){
        return " there";
    }

    // Abstract Class from the Interface Sport Class
    public void sport() {
        System.out.println("hey");
    }

    public void division(){
        System.out.println("there");
    }

}

class Forward extends Player{

    // Implementation of Abstract Methods from the Player Class
    public String play(){
        return "Player Core Play: score goal";
    }
    //the Midfield Class MUST define a PLAY() method because it inherits from the Player and is not defined as an Abstract.

    public String passBall(){
        return "Pass Ball: if no shot available, pass to player with opportunity to score";
    }

    public String shootBall(){
        return "Shoot Ball: if within range, go for goal";
    }

    public String cornerBall(){
        return "Corner Ball: go for goal";
    }

    // Abstract Class implementation from the Abstract Team Class
    public String teamChant() {
        return "hey";
    }
    public String teamColors(){
        return " there";
    }

    // Abstract Class from the Interface Sport Class
    public void sport() {
        System.out.println("hey");
    }

    public void division(){
        System.out.println("there");
    }
}

class Defender extends Player{


    public Defender() {
    }

    public Defender(String name) {
        super(name);
    }

    public Defender(String name, String position) {
        super(name, position);
    }

    public Defender(String name, String position, int number) {
        super(name, position, number);
    }

    // Implementation of Abstract Methods from the Player Class
    public String play(){
        return "Player Core Play: stop attack";
    }

    public String passBall(){
        return "Pass Ball: build from the back";
    }

    public String shootBall(){
        return "Shoot Ball: if a rare opportunity presents itself shoot";
    }

    public String cornerBall(){
        return "Corner Ball: header to the goal";
    }

    // Abstract Class implementation from the Abstract Team Class
    public String teamChant() {
        return "hey";
    }
    public String teamColors(){
        return " there";
    }

    // Abstract Class from the Interface Sport Class
    public void sport() {
        System.out.println("hey");
    }

    public void division(){
        System.out.println("there");
    }
}

class Goalie extends Player{

    public Goalie(){};
    public Goalie(String name){
        super(name);
    }
    public Goalie(String name, String position){
        super(name, position);
    }
    public Goalie(String name, String position, int number){
        super(name, position, number);
    }

    // Implementation of Abstract Methods from the Player Class
    public String play(){
        return "Player Core Play: stop ball";
    }
    public String passBall(){
        return "Pass Ball: begin buildup";
    }

    public String shootBall(){
        return "Shoot Ball: stop ball";
    }

    public String cornerBall(){
        return "Corner Ball: stop ball";
    }

    // Abstract Class implementation from the Abstract Team Class
    public String teamChant() {
        return "hey";
    }
    public String teamColors(){
        return " there";
    }

    // Abstract Class from the Interface Sport Class
    public void sport() {
        System.out.println("hey");
    }

    public void division(){
        System.out.println("there");
    }
}
