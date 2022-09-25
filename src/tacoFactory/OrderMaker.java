package tacoFactory;

import util.Input;

import java.util.HashMap;

public class OrderMaker {

    public static TacoOrder customerMaker(){
        Input userInput = new Input();
        String name = userInput.getString("Name for order?");
        TacoOrder customer = new TacoOrder(name);
//        System.out.println(customer.getCustomerName());
//        System.out.println(customer.getOrder());
        return customer;

    }

    public static void tacoBuilder(){
//        HashMap<String, TacoOrder> customerOrder = new HashMap<>();
//        customerOrder.put(customerMaker().customerName, customerMaker());
        TacoOrder customer = customerMaker();
        System.out.println(customer.getCustomerName());
        Taco.displayMenu();

        Input userInput = new Input();
//        String response = userInput.getString("Can I get a name for your order?");
//        String name = response;

        String test = userInput.getString("What taco would you like to add to your order?");
        Taco one = new Taco(test);

        userInput.getString("Want to add any more tacos to your oder?");

        System.out.println(one.getName());
//        System.out.println(name + "f");

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
//        customerMaker();
//        tacoMenu();
//        Taco fajita = new Taco("Fajita");
//        System.out.println(tacoOrder(fajita));
//        System.out.println(fajita.getName());


    }
}
