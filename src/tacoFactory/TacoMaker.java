package tacoFactory;

import java.util.ArrayList;
import java.util.HashMap;

public class TacoMaker {

    public static void tacoMenu(){
        System.out.println("1-Fajita 2-Chicken Fajita 3-Carne Guisada 4-Bacon & Egg 5-Sausage & Egg 6-Al Pastor");
    }

    public ArrayList tacoOrder(Taco taco){
        return  new ArrayList<>();
    }

    public static HashMap tacoOrder(HashMap<String , ArrayList<Taco>> order){


        return new HashMap();
    }

    public static void main(String[] args) {

        tacoMenu();
    }
}
