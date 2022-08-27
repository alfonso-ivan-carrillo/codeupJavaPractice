package Shapes;
import util.Input;
public class CircleApp {

    CircleApp circles;

    public static void askRad(){
        Input input = new Input();
        int count = 0;

        do {
            Circle one = new Circle(input.getDouble("Enter the radius of your circle:"));
            System.out.printf("The radius you entered is %,.2f and the area is %,.3f. \n", one.getRadius(), one.gitArea());
            System.out.printf("The radius you entered is %,.2f and the circumference is %,.3f. \n", one.getRadius(), one.getCir());
            input.yesNo("Would you like to go again?");
            count++;

        } while (input.yesNo());
        System.out.println(count + " number of circles created.");
    }


    public static void main(String[] args) {

    Circle one = new Circle(5.5);
        System.out.println(one.getCir());
    CircleApp.askRad();
    one.setRadius(8);
        System.out.println(one.getCir());

    }
}
