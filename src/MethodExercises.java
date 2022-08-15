import java.util.Scanner;

public class MethodExercises {

    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static int minus(int num1, int num2){
        return num1 - num2;
    }

    public static int times(int num1, int num2){
        return num1 * num2;
    }

    public static int div(int num1, int num2){
        if (num1 == 0 || num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public static int mod(int num1, int num2){
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return num1 % num2;
    }

    // Bonus

    public static int multLoop(int num1, int num2){

        int total = 0;
        for(int i = 1; i <= num2; i++){
         total += num1;
//            System.out.println(total);
        }
        return total;
    }

    public static int multRec(int num1, int num2){
        int total = 0;
        if (num2 == 0){
            return 0;
        } else {
//            System.out.println(num1);
//            System.out.println(num2 - 1);

            total += num1 + multRec(num1, num2 - 1);
//            System.out.println(num1);
//            System.out.println(num2 - 1);
//            System.out.println("total: "+ total);
            return total;
        }
    }
    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d. \n", min, max);
        int userInput = scan.nextInt();
        if (userInput < min || userInput > max){
            System.out.printf("The number %d is not in range. \n", userInput);
            return getInteger( min, max);
        } else {
            System.out.printf("The number %d is within range. \n", userInput);
            return userInput;
        }

    }

    public static void factorial(){
        String keepGoing = "yes";
        long fac = 1;

        while (keepGoing.equals("yes")){
            int userNum = getInteger(1, 10);
            for(int i = 1; i <= userNum; i++){
                fac *= i;
                System.out.println(fac);
            }
//            System.out.println(fac);
            Scanner scan = new Scanner(System.in);
            System.out.println("Keep going?");
            keepGoing = scan.nextLine();
        }
    }
//public static void factorial() {
//    Scanner sc = new Scanner(System.in).useDelimiter("\n");
//
//    String willContinue;
//
//    do {
//        long userFactorial = 1;
//        int userNumber = getInteger(1, 10);
//        System.out.printf("You chose %d!\n", userNumber);
//        for(int i = 1; i <= userNumber; i++) {
//            userFactorial *= i;
//        }
//        System.out.println(userFactorial);
//        System.out.println("Would you like to continue? (yes/no)");
//        willContinue = sc.nextLine();
//    } while (willContinue.equalsIgnoreCase("yes"));
//}

    public static void diceGame(){

        String rollDice = "yes";

        Scanner ask = new Scanner(System.in);
        System.out.println("Roll dice?");
        rollDice = ask.nextLine();
        System.out.println(rollDice);

        while (rollDice.equalsIgnoreCase("yes")) {
            Scanner numSides = new Scanner(System.in);
            System.out.println("Please enter the number of sides to dice.");
            int sides = numSides.nextInt();

            int dice1 = (int) (Math.random() * sides) + 1;
            int dice2 = (int) (Math.random() * sides) + 1;
            System.out.println(dice1);
            System.out.println(dice2);
            System.out.println("Roll Dice?");
            rollDice = ask.nextLine();
        }

    }

    public static void main(String[] args) {

        System.out.println(add(5, 10));
        System.out.println(minus(5, 10));
        System.out.println(times(5, 10));
        System.out.println(div(10, 5));
        System.out.println(mod(5,2));
        System.out.println(div(5,0));

        System.out.println(multLoop(5,5));
        System.out.println(multRec(5,5));

//        getInteger(1, 10);

//        factorial();

        diceGame();

    }
}
