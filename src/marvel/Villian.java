package marvel;

public class Villian extends Hero{

    public Villian(String villianName){
        super(villianName);
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



    public static void main(String[] args) {
        Villian eric = new Villian("Magneto");
        eric.setPower("mutant");

        System.out.println(eric.name);
        System.out.println(eric.power);
        System.out.println(eric.team());
        System.out.println("----------------");
        Villian maxon = new Villian("Red Skull");
        maxon.setPower("artificial");
        System.out.println(maxon.name);
        System.out.println(maxon.power);
        System.out.println(maxon.team());





    }
}
