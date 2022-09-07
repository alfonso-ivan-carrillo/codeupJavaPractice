package soccer;

public class LineUp {

    public static void main(String[] args) {
        // Player player = new Player();
        // Will not compile, Player Class is defined as an Abstract and cannot be directly instantiated.

        Player ethan = new Midfield("ethan", "the six", 22);  // constructor in MidField class
        System.out.println(ethan.name + " " + ethan.position + " " + ethan.number);
        System.out.println(ethan.play());
        System.out.println(ethan.passBall());
        System.out.println(ethan.shootBall());
        System.out.println(ethan.cornerBall());
        System.out.println(ethan.getNumber());
        ethan.setNumber(23);
        ethan.setName("Ethan Carrillo");
        ethan.setPosition("the nine");
        System.out.println(ethan.name + "\n " + ethan.position + " \n" + ethan.number);
        Player fecho = new Forward();  // no constructor in class
        fecho.setName("fecho");
        fecho.setPosition("the eleven");
        fecho.setNumber(10);
        System.out.println("Name:" +fecho.name + "\nPosition:" + fecho.position + "\nNumber:" + fecho.number);
        System.out.println(fecho.play());
        System.out.println(fecho.passBall());
        System.out.println(fecho.shootBall());
        System.out.println(fecho.cornerBall());


        Barca barca = new Barca("Barcelona", "Xavi");
        System.out.println(barca.manager);
        System.out.println(barca.teamName);
        barca.bench();
        barca.roster();
        barca.starters(11);





    }
}
