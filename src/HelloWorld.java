import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;   // imports the SCANNER utility

public class HelloWorld {


    public static void main(String[] args) {

//        String villian = "anton chigur";
////        System.out.println(villian.length());
////        System.out.println(villian);
//
//        int villianNumber = 1;
////        System.out.println(villianNumber);
//
//        boolean killer = true;
////        System.out.println(killer);
//
//        System.out.println("Name: " + villian + "\nRank: " + villianNumber + "\nKiller: " + killer );
//        System.out.printf("Name: %s. Rank: %d Killer: %b \n", villian, villianNumber, killer);
//
//        Scanner userAnswer = new Scanner(System.in);
//
//        System.out.println("Enter Something: ");
//        String userInput = userAnswer.next();
//
//        System.out.println("You entered: \n --> " + userInput + " <--");
//
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approx: %s \n", pi);
//        System.out.printf("The value of pi is: %.2f.\n", pi);
//
//        Scanner scanner1 = new Scanner(System.in);
//        Scanner scanner2 = new Scanner(System.in);
//        Scanner scanner3 = new Scanner(System.in);
//
//        System.out.println("Enter three words, please.");
//        String answer1 = scanner1.next();
//        String answer2 = scanner2.next();
//        String answer3 = scanner3.next();
//
//        System.out.printf("First word: %s \nSecond word: %s \nThird word: %s \n", answer1, answer2, answer3);
//
//        Scanner scanThreeWords = new Scanner(System.in);
//
//        System.out.println("Enter three words.");
//        String threeWords = scanThreeWords.nextLine();
//        System.out.println(threeWords);
//        String test = threeWords;
//        String[] parseWords = test.split(" ");
//            for (String i: parseWords){
//                System.out.println(i);
//            }
//
//        for (var i = 0; i <= 10; i++){
//            System.out.println(i);
//        }
//
//
//        Scanner scanYes = new Scanner(System.in);
//        System.out.println("Enter yes or no");
//        String answerYes = scanYes.nextLine();
//
//        boolean confirmation = answerYes.equals("yes");
//        System.out.println(confirmation);
//
//        for (var num = 0; num <= 100; num++ ){
//            if(num % 3 == 0 && num % 5 ==0){
//                System.out.println("Fizz Buzz");
//            } else if (num % 3 == 0){
//                System.out.println("Fizz");
//            } else if (num % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(num);
//            }
//        }
//        boolean booTest = true;
//        if (booTest ){
//            System.out.println("booTest");
//            booTest = false;
//            System.out.println(booTest);
//        }
//
        int caseSwitch = 1;

        switch (caseSwitch){
            case 1:
                System.out.println("case 1");
                break;                          // stop switch from going further and prevent fall through
            case 2:
                System.out.println("case 2");
            default:
                System.out.println("Default Case");
                break;
        }

        int breakOut = 0;

        while (breakOut <= 10){
            System.out.println("breakout value: " + breakOut);
            breakOut++;
        }

        System.out.println("*********");

        do{
            System.out.println("breakout value: " + breakOut);
            breakOut --;
        } while (breakOut >= 0);



        for (int i = 0; i < 100; i++){
            System.out.println(i);
            if(i == 5){
                break;      // break; --> exits out or breaks out of the for loop
            }
        }
        System.out.println("*************");
        for(int i = 0; i <= 10; i++){
            if( i % 2 == 0){
                continue;   // continue; takes for loop back to the top, so System.out.println(i); doesn't print out number i that can be divided by 2 - only odd numbers are printed out
            }
            System.out.println(i);
        }
//
//        int theAnswer;
//        String question = "What is your favorite number?";
//
//        theAnswer = 42;
//
//        System.out.println(question + " " + theAnswer);
//
//        System.out.println("Hello World!");
//        System.out.print("Hello World!");
//
//        System.out.println("Code inside of curly braces should be indented");
//        System.out.println("with four spaces");
//        System.out.println("\""); // => "
//        System.out.println("\\"); // => \
//        System.out.println("new line \n"); // => the newline character
//        System.out.println("tab \t"); // => the tab character
////
////        int myNumber = 12 + 12 * 2;
////        System.out.println(myNumber);
////        myNumber += 9;
////        System.out.println(myNumber);
//
//
//        int myFavoritNumber = 2;
//        System.out.println(myFavoritNumber);
//
//        String myString = "Pearl Jam";
//        System.out.println(myString);
//
//        float myNumber = (float) 3.14;
//        System.out.println(myNumber);
//
//        int y = 5;
//        System.out.println(y++);  // post increment
//        System.out.println(y);
//
//        int x = 5;
//        System.out.println(++x);  // pre increment
//        System.out.println(x);
//
//        String theNumberThree = "three";
//        System.out.println(theNumberThree);
//        Object o = theNumberThree;
//        System.out.println(o);
////        int three = (int) "three";
////        System.out.println(three);
//
//        int g = 4;
////        g = g + 5;  // long hand
//        g += 5;       // shorthand
//        System.out.println(g);
//
//        int f = 3;
//        int h = 4;
////        h = h * f;    // long hand
//        h *= f;         // shorthand
//        System.out.println(h);
//
//        int e = 10;
//        int r = 2;
//
////        e = e/r;  // long hand
//        e /= r;     // shorthand
//
////        r = r - e;    // long hand
//        r -= e;         // shorthand
//        System.out.println(e);
//        System.out.println(r);
//
//        String name = "codeup";   // %s is placeholder for string
//
//        System.out.printf("Hello there, %s. Nice to see you. %n", name);
//        System.out.println("hi");
//
//        String greeting = "Salutations";
//        System.out.printf("%s, %s!", greeting, name);   // order of placeholder variable matters
//
//        int num = 45;           // $d is placeholder for integer
//        float numFloat = 34;    // $f is placeholder for float
//
//        System.out.printf("The integer number is %d and the float number is %f. %n", num, numFloat);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter something: ");
////        String userInput = scanner.next();  // captures only the first word that is typed, whitespace seperates words
//        String userInput = scanner.nextLine();  // captures everything typed into the line
//                                                // nextInt will return the user input as type int
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//


    }
}

