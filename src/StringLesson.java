import java.util.Scanner;

public class StringLesson {

    public static void main(String[] args) {
//        Unlike the other types we've worked with so far, strings are objects, not primitives.
//        This means that String variables are a reference type, not a primitive type,
//        and is the reason that the == operator does not behave as expected when comparing strings.

        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();

        // Don't do this!
        boolean confirmation = userInput == "y";
        System.out.println(confirmation);
        // do this instead
        System.out.println(userInput.equalsIgnoreCase("y"));

        String input = "Codeup Rocks!";

        input.equals("codeup rocks!"); // false
        input.equals("Codeup Rocks!"); // true

        input.equalsIgnoreCase("codeup rocks!"); // true
        input.equalsIgnoreCase("Codeup Rocks!"); // true

        input.startsWith("codeup");  // false
        input.startsWith("Codeup");  // true

        input.endsWith("rocks");  // false
        input.endsWith("rocks!");  // false
        System.out.println(input.endsWith("Rocks!"));  // true

//        STRING MANIPULATION METHODS
        String soccer = "Liverpool";

        System.out.println(soccer.charAt(2));  // Returns the character at the specified index of the string.

        System.out.println(soccer.indexOf("po"));
        // Returns the index of the first occurrence of a certain substring. Returns -1 if the substring is not found.

        System.out.println(soccer.lastIndexOf("po"));
        // Like indexOf, but starts the search from the end of the string.

        System.out.println(soccer.length()); //Returns the length of a string.

        System.out.println(soccer.replace("pool", "ball"));
        // Returns a copy of the string that has pattern replaced with replacement.

        System.out.println(soccer.substring(3,5));
        // Returns a new substring that starts at a specified index and (optionally) ends at the specified index.

        System.out.println(soccer.toLowerCase()); // Returns a string that has all lower case letters.

        System.out.println(soccer.toUpperCase()); // Returns a string that has all upper case letters.

        System.out.println(soccer.trim());  // Returns a copy of the string without leading and trailing whitespaces.


    }
}
