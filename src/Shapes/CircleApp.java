package Shapes;
import util.Input;
public class CircleApp {

    CircleApp circles;

    public static void askRad(){
        Input input = new Input();

        do {
            Circle one = new Circle(input.getDouble("Enter the radius of your circle:"));
            System.out.printf("The radius you entered is %,.2f and the area is %,.3f. \n", one.getRadius(), one.gitArea());
            System.out.printf("The radius you entered is %,.2f and the circumference is %,.3f. \n", one.getRadius(), one.getCir());

        } while (input.yesNo("Again?"));

    }


    public static void main(String[] args) {


    askRad();


    }
}
