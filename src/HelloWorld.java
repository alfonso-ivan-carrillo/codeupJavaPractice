public class HelloWorld {


    public static void main(String[] args) {

        int theAnswer;
        String question = "What is your favorite number?";

        theAnswer = 42;

        System.out.println(question + " " + theAnswer);

        System.out.println("Hello World!");
        System.out.print("Hello World!");

        System.out.println("Code inside of curly braces should be indented");
        System.out.println("with four spaces");
        System.out.println("\""); // => "
        System.out.println("\\"); // => \
        System.out.println("new line \n"); // => the newline character
        System.out.println("tab \t"); // => the tab character
//
//        int myNumber = 12 + 12 * 2;
//        System.out.println(myNumber);
//        myNumber += 9;
//        System.out.println(myNumber);


        int myFavoritNumber = 2;
        System.out.println(myFavoritNumber);

        String myString = "Pearl Jam";
        System.out.println(myString);

        float myNumber = (float) 3.14;
        System.out.println(myNumber);

        int y = 5;
        System.out.println(y++);  // post increment
        System.out.println(y);

        int x = 5;
        System.out.println(++x);  // pre increment
        System.out.println(x);

        String theNumberThree = "three";
        System.out.println(theNumberThree);
        Object o = theNumberThree;
        System.out.println(o);
//        int three = (int) "three";
//        System.out.println(three);

        int g = 4;
//        g = g + 5;  // long hand
        g += 5;       // shorthand
        System.out.println(g);

        int f = 3;
        int h = 4;
//        h = h * f;    // long hand
        h *= f;         // shorthand
        System.out.println(h);

        int e = 10;
        int r = 2;

//        e = e/r;  // long hand
        e /= r;     // shorthand

//        r = r - e;    // long hand
        r -= e;         // shorthand
        System.out.println(e);
        System.out.println(r);
    }
}
