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
        if(answer == "yes" || answer == "y" || answer == "yup"){
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number.");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max){
            return userInput;
        } else {
            System.out.println("Try again");
            return getInt(min,  max);
        }
    }


    public static void main(String[] args) {

    Input one = new Input();
        System.out.println(one.getInt(1, 10));

    }
}
