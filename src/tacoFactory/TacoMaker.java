package tacoFactory;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class TacoMaker {


    public static void tacoBuilder(){
        Input userInput = new Input();
        String response = userInput.getString("What type of taco?");
        Taco one = new Taco(response);

        System.out.println(one.getName());

    }

//    public static ArrayList<Taco> tacoMenu(){
//        System.out.println("1-Fajita 2-Chicken Fajita 3-Carne Guisada 4-Bacon & Egg 5-Sausage & Egg 6-Al Pastor");
//        ArrayList<Taco> tacoList = new ArrayList<>();
//        return tacoList;
//    }
//
//    public static ArrayList<Taco> tacoOrder(Taco taco){
//        ArrayList<Taco> order = new ArrayList<>();
//        order.add(taco);
//        return order;
//    }
//
//    public static HashMap tacoOrder(HashMap<String , ArrayList<Taco>> order){
//
//
//        return new HashMap();
//    }

    public static void main(String[] args) {

        tacoBuilder();

//        tacoMenu();
//        Taco fajita = new Taco("Fajita");
//        System.out.println(tacoOrder(fajita));
//        System.out.println(fajita.getName());


    }
}
