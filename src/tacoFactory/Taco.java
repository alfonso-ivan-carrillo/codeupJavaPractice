package tacoFactory;

import java.util.HashMap;

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

    public static void displayMenu(){
        HashMap<String, Taco> displayMenu = new HashMap<>();
        Taco fajita = new Taco("fajita", 4);
        displayMenu.put("fajita", fajita );
        Taco chickenFajita = new Taco("chicken fajita", 3);
        displayMenu.put("chicken fajita", chickenFajita);
        Taco carneGuisada = new Taco("carne guisda", 3);
        displayMenu.put("carneGuisada", carneGuisada);
        Taco barbacoa = new Taco("barbacoa", 4);
        displayMenu.put("barbacoa", barbacoa);
        Taco brisket = new Taco("brisket", 5);
        displayMenu.put("brisket", brisket);
        Taco elPastor = new Taco("el pastor", 3);
        displayMenu.put("el pastor", elPastor);
        System.out.println("Today's Menu:");
        displayMenu.entrySet().stream().forEach(entry -> System.out.println(entry.getValue().getName() + " - $" + entry.getValue().getCost()));
    }

    public static void main(String[] args) {
        displayMenu();
    }

}
