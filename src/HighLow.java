import java.util.Scanner;

public class HighLow {

    public static void highLow(){
        int cpuNumber = (int) (Math.random() * 100 +1);
        System.out.println(cpuNumber);
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        int userGuess = scan.nextInt();
        String keepGoing = "yes";
        int counter = 0;


        while(keepGoing == "yes") {
            if (userGuess < 0 || userGuess > 100) {
                System.out.println("Number out of range.");
                highLow();
            } else if (userGuess < cpuNumber) {
                System.out.println("Higher!");
                counter += 1;
                System.out.println("Number of Guess: "+ counter);
                if (counter == 5){
                    System.out.println("Max guess limit reached.");
                    keepGoing = "no";
                    break;
                }
                System.out.println("Guess again.");
                userGuess = scan.nextInt();

            } else if (userGuess > cpuNumber) {
                System.out.println("Lower!");
                counter += 1;
                System.out.println("Number of Guess: "  + counter);
                if (counter == 5){
                    System.out.println("Max guess limit reached.");
                    keepGoing = "no";
                    break;
                }
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
