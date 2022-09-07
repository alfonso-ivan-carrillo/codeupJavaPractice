package soccer;

public class Team {


    public static void main(String[] args) {

        Player ethan = new Midfield("ethan", "the six", 22);  // constructor in MidField class
        System.out.println(ethan.name + " " + ethan.position + " " + ethan.number);
        System.out.println(ethan.play());
        System.out.println(ethan.passBall());
        System.out.println(ethan.shootBall());
        System.out.println(ethan.cornerBall());
        Player fecho = new Forward();  // no constructor in class
        fecho.setName("fecho");
        fecho.setPosition("the eleven");
        fecho.setNumber(10);
        System.out.println("Name:" +fecho.name + "\nPosition:" + fecho.position + "\nNumber:" + fecho.number);
        System.out.println(fecho.play());
        System.out.println(fecho.passBall());
        System.out.println(fecho.shootBall());
        System.out.println(fecho.cornerBall());

    }
}
