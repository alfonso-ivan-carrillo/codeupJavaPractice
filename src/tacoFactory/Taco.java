package tacoFactory;

public class Taco {

    public String name;
    public int cost;

    public Taco() {
    }

    public Taco(String name) {
        this.name = name;
    }

    public Taco(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

}
