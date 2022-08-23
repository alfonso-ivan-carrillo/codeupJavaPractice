package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        System.out.println("Enter something:");
        String output = scanner.nextLine();
        return String.format("You entered: %s", output);
    }

    public boolean yesNo(){
        System.out.println("Yes or no?");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase( "yup")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.println("Enter an int.");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max){
            return userInput;
        } else {
            System.out.println("Try again");
            return getInt(min,  max);
        }
    }

    public int getInt(){
        System.out.println("Enter an int.");
        int number = scanner.nextInt();
        return number;
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a double.");
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max){
            return userInput;
        } else {
            System.out.println("Try again");
            return getDouble(min,  max);
        }
    }

    public double getDouble(){
        System.out.println("Enter a double.");
        double userInput = scanner.nextDouble();
        return userInput;
    }


}
