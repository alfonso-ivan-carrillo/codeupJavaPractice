package marvel;

public class Villian extends Hero{

    public Villian(){
    }
    public Villian(String villianName){
        super(villianName);
    }

    public Villian(String villianName, String power, String alterEgo){
        super(villianName, power, alterEgo);
    }


    public String team(){
        if (power.equalsIgnoreCase("mutant")){
            return ("The villian " + name + " belongs to the Hell-Fire Club.");
        } else if ( power.equalsIgnoreCase("artificial")){
            return ("The villian " + name + " belongs to the Hydra.");
        } else {
            return "regular human.";
        }
    }


}
