package marvel;

public class Hero {
    public String name;
    protected String power;

    public Hero () {
    }
    public Hero(String name){
        this.name = name;
    }
    public Hero (String name, String power){
        this.name = name;
        this.power = power;
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

    public static void main(String[] args) {

        Hero wolverine = new Hero();
        wolverine.setName("wolverine");
        wolverine.setPower("mutant");
        System.out.println(wolverine.getName());
        System.out.println(wolverine.getPower());
        System.out.println(wolverine.team());

        Hero cptRogers = new Hero();
        cptRogers.setPower("artificial");
        cptRogers.setName("Steve Rogers");
        System.out.println(cptRogers.getName());
        System.out.println(cptRogers.getPower());
        System.out.println(cptRogers.team());


    }
}
