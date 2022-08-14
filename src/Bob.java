import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        String questionResponse = "Sure.";
        String exclamation = "Whoa, chill out";
        String noResponse = "Fine. Be that way!";
        String teenageResponse = "Whatever";

        String keepGoing = "y";

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ask Bob a question.");
            String adult = scanner.nextLine();
            if(adult.endsWith("?")){
                System.out.println(questionResponse);
            } else if (adult.endsWith("!")){
                System.out.println(exclamation);
            } else if(adult.isEmpty()){
                System.out.println(noResponse);
            } else if (adult.contains("bye")){
                System.out.println("bye");
                keepGoing = "no";
            } else {
                System.out.println(teenageResponse);
            }


        } while (keepGoing.equalsIgnoreCase("y"));





    }
}
