public class ControlStatemetnsAndLoopsLesson {

    public static void main(String[] args) {

        String inputString = "y";
        String userInput = "y";

        System.out.println(inputString == userInput);
        System.out.println(inputString.equals(userInput));

//        ***** if statement
//        if (/* condition */) {
//            // conditional code
//        }

//        boolean someCondition = false;
//        boolean someOtherCondition = true;
//
//        if (someCondition) {
//            // executes if someCondition is true
//        } else if (someOtherCondition) {
//            // executes if someOtherCondition is true *and* all of the previous ifs in
//            // this block were false
//        } else {
//            // executes if none of the conditions checked in this block were true
//        }


//        **** Switch Statement ****
        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                break;
                // Fall through! if you don't include a -> break; it will also print out: "Case 2"
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }

//        **** While Loop ****
//        while (/* condition */) {
//            // loop body
//        }
//        A while loop executes the body of the loop as long as the loop condition evaluates to true.
//        The condition will be evaluated before the body of the loop executes, and after the body of loop finishes.

        int i = 0;

        while ( i <= 10){
            System.out.println( "i is " + i);
            i++;
        }

//        **** Do Loop ****
//        do {
//            //Statements
//        }while(/* condition */);
//        A do or do-while loop is the same as a while loop, except that the body of the loop will execute
//        before the condition is evaluated. You should use a do loop over a while loop if you want the code
//        inside the body of the loop to evaluate at least once, or you want to the loop body to be evaluated
//        before the loop condition.

        do {
            System.out.println("You will see this despite the condition!");
        } while (false);


//        **** For Loop ****
//        A for loop is useful when we know ahead of time how many times our loop needs to execute.
//        As we'll see later, it is also commonly used with arrays
        for(int q = 0; q < 10; q += 1) {
            System.out.println("q is " + q);
        }

//        *** Break and Continue ***
//        A break statement is used to exit the current loop. In the case of multiple nested loops,
//        a labeled break statement may be used to differentiate which loop to exit.
//        A continue statement is used to skip any remaining statements in the current loop and jump
//        to the top of the current loop. A labeled continue statement may be used to jump to the top of a labeled loop.

        for(int z = 1; z <= 10; z++) { // <--+
            if(z % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println("z is " + z);
        }
    }
}
