import java.util.Scanner;

public class ControlFlowExercises {


    public static void main(String[] args) {

        int i = 5;
        while (i <= 15){
            System.out.println("i is now: " + i);
            i++;
        }

        System.out.println("--------");

        int d = 0;

        do {
            System.out.println("d is now: " + d);
            d += 2;
        } while (d <= 100);

        System.out.println("--------");

        int s = 100;

        do {
            System.out.println("s is now: " + s);
            s -= 5;
        } while (s >= -10);

        System.out.println("--------");

        int squared = 2;

        do {
            System.out.println(squared);
            squared = (int) Math.pow(squared, 2);
        } while (squared <= 65536);

        System.out.println("--------oo");

        for (int b = 5; b <= 15; b++){
            System.out.println(b);
        }

        System.out.println("--------");

        for (int f = 0; f <= 100; f += 2){
            System.out.println(f);
        }

        System.out.println("--------");

        for (int p = 100; p >= -10; p -= 5){
            System.out.println(p);
        }

        System.out.println("--------");

        for (int t = 2; t <= 65536; t = (int) Math.pow(t, 2)){
            System.out.println(t);
        }

        System.out.println("--------");

        for(int m = 1; m <= 100; m++){
            if(m % 3 == 0 && m % 5 == 0){
                System.out.println("FizzBuzz!");
            } else if (m % 3 == 0) {
                System.out.println("Fizz!");
            } else if (m % 5 == 0){
                System.out.println("Buzz!");
            } else {
                System.out.println(m);
            }
        }

        System.out.println("--------");

        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");

        int userInput = scan.nextInt();
        System.out.println(userInput);
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("--------------------------");

        for(int num = 1; num <= userInput; num++){
            int sq = (int) Math.pow(num, 2);
            int cube = (int) Math.pow(num, 3);
            System.out.println(num + "      |     " + sq + "   |  " + cube );
        }

        System.out.println("--------------------------");



        String goOn = "y";

        while (goOn.equalsIgnoreCase("y")){
            System.out.println("Please enter your grade (1 to 100)");
            Scanner gradeScan = new Scanner(System.in);
            int userGrade = gradeScan.nextInt();

            Scanner scanGo = new Scanner(System.in);
            if (userGrade >= 88 && userGrade <= 100){
                System.out.println("A");
            } else if (userGrade >= 80 && userGrade <= 88) {
                System.out.println("B");
            } else if (userGrade >= 67 && userGrade <= 79) {
                System.out.println("C");
            } else if (userGrade >= 60 && userGrade <= 66) {
                System.out.println("D");
            } else if (userGrade >= 0 && userGrade <= 59){
                System.out.println("F");
            } else {
                System.out.println("Enter a valid grade.");
            }
            System.out.println("continue?");
            goOn = scanGo.next();

        }






    }
}
