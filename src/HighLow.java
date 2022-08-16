import java.util.Scanner;

public class HighLow {

    public static void highLow(){
        int cpuNumber = (int) (Math.random() * 100 +1);
        System.out.println(cpuNumber);
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        int userGuess = scan.nextInt();
        String keepGoing = "yes";


        while(keepGoing == "yes") {
            if (userGuess < 0 || userGuess > 100) {
                System.out.println("Number out of range.");
                highLow();
            } else if (userGuess < cpuNumber) {
                System.out.println("Higher!");
                System.out.println("Guess again.");
                userGuess = scan.nextInt();
            } else if (userGuess > cpuNumber) {
                System.out.println("Lower!");
                System.out.println("Guess again.");
                userGuess = scan.nextInt();
            } else if (userGuess == cpuNumber) {
                System.out.println("Good Guess!");
                keepGoing = "no";
            } else {
                System.out.println("error");
            }
        }
    }



    public static void main(String[] args) {

        highLow();

    }
}
