package marvel;

import util.Input;

public class HeroMaker {
    HeroMaker makers;
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

    public static void main(String[] args) {


        maker();
    }

}
