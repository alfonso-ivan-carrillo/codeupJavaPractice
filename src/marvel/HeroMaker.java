package marvel;

import util.Input;

import java.util.Arrays;

public class HeroMaker {
//    private static Object Hero;  // to create a Hero Object
//    HeroMaker makers;
    public static void maker(){
        Input one = new Input();

        do {
            Hero hero = new Hero();
            hero.setName(one.getString("Enter hero's name:"));
            hero.setPower(one.getString("Power? (mutant, artificial or other)"));
            System.out.printf("Hero's name: %s and hero's power: %s. \n", hero.getName(), hero.getPower());
            System.out.println(hero.team());
        } while (one.yesNo("Make another hero?"));
    }

//    public static void heroList(){
//        Input two = new Input();
//
//        do {
//            Hero heros = new Hero();
//            heros.setName(two.getString("Enter Name: "));
//            heros.setPower(two.getString("Enter Power: "));
//            Object[] listed = new Object[heros];
//
//        } while (two.yesNo("again?"));
//    }

    public static void main(String[] args) {

        Hero[] league = new Hero[2];
        league[0] = new Hero("wolverine", "mutant");
        league[1] = new Hero("deadpool", "mutant");


        for (int i = 0; i < league.length; i++){
            System.out.println(league[i].getName()+ "--" + league[i].getPower());;
        }
        System.out.println("__________________");


        Villian eric = new Villian();
        eric.setName("Magneto");
        eric.setPower("mutant");
        eric.setAlterEgo("eric");



        System.out.println(eric.name);
        System.out.println(eric.power);
        System.out.println(eric.alterEgo);
        System.out.println(eric.team());
        System.out.println("----------------");
        Villian maxon = new Villian("Red Skull");
        maxon.setPower("artificial");
        System.out.println(maxon.name);
        System.out.println(maxon.power);
        System.out.println(maxon.team());
        System.out.println(maxon.getPower());
        System.out.println("----------------");

        Hero wolverine = new Hero("wolverine", "mutant", "Logan");

        System.out.println(wolverine.name);
        System.out.println(wolverine.power);
        System.out.println(wolverine.team());

        System.out.println("----------------");
        System.out.println("----------------");





    }
}
