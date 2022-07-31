import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
        float piAbb = (float) pi;
        System.out.printf("The value of pi is approximately %f. %n", piAbb);

        // nextInt();  nextLong(); nextFloat(); nextDouble(); nextString();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = scanner1.nextInt();
        System.out.println("The number you entered is " + userInput + ".");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please Enter a float:");
        float userInputFloat = scanner2.nextFloat();
        System.out.println("The float you entered is " + userInputFloat + ".");

        Scanner scanWordOne = new Scanner(System.in);

        System.out.println("Enter three words.");

        String userInputWord1 = scanWordOne.nextLine();

        System.out.println("The 3 words are: " + userInputWord1 + ".");

    }
}
