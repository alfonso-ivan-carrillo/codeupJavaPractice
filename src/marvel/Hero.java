package marvel;

public class Hero {
    public String name;
    protected String power;
    protected String alterEgo;

    public Hero () {
        System.out.println("Hero or Villian, only time will tell.");
    }
    public Hero(String name){
        this.name = name;
    }
    public Hero (String name, String power){
        this.name = name;
        this.power = power;
    }

    public Hero(String name, String power, String alterEgo){
        this.name = name;
        this.power = power;
        this.alterEgo = alterEgo;
        System.out.printf("%s, keep your alterego name %s hidden. \n", name, alterEgo);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPower(){
        return power;
    }

    public void setPower(String power){
        this.power = power;
    }

    public String team(){
        if (power.equalsIgnoreCase("mutant")){
            return ("The hero " + name + " belongs to the X-Men.");
        } else if ( power.equalsIgnoreCase("artificial")){
            return ("The hero " + name + " belongs to the Avengers.");
        } else {
            return "regular human.";
        }
    }

}
