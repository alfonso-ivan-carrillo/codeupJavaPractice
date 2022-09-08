package soccer;

public class LineUp {

    public static void main(String[] args) {
        // Player player = new Player();
        // Will not compile, Player Class is defined as an Abstract and cannot be directly instantiated.

        Player ethan = new Midfield("ethan", "the six", 22);
        // constructor in MidField class - appears NOT to Inherit CONSTRUCTORS from Super Class (Player)
        // able create Midfield object with Fields, Don't have to set one each time
        // able to set Fields also afterwards because it inherits from the Super Class (Player)
        System.out.println("Player Name: " + ethan.name);
        System.out.println("Position: " + ethan.getPosition());
        System.out.println("Current Number: " + ethan.number);
        ethan.setNumber(6);
        System.out.println("New Number: " + ethan.number);

        System.out.println("_______________________");

        Player fecho = new Forward();   // no constructor in class
        fecho.setName("fecho");         // fields/values have to be set by GETTERS/SETTERS
        fecho.setPosition("The ten");
        fecho.setNumber(10);
        fecho.setNumber(11);
        System.out.println(fecho.number);
        System.out.println(fecho.getPosition());

        System.out.println("_______________________");

        Team barca = new SoccerTeam("Barcelona FC", "Xavi", "Catalan", 24, 6);
        System.out.println(barca.teamName);
        barca.setTeamName("Barca FC");
        System.out.println(barca.teamName);
        System.out.println(barca.teamName+ " : " + barca.mascot + " : " + barca.managerName);
        System.out.println(barca.teamChant());
        System.out.println(barca.teamColors());


        barca.sport();
        barca.division();




    }
}
