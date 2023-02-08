import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class ArrayLesson {


    public static void main(String[] args) {


//        An Java, arrays are a special kind of object that contain zero or more
//        items called elements. Array elements can be any valid type (including
//        a custom class we've defined ourselves), but all elements must be of
//        the same type.
        double[] prices;
//        Java arrays have a fixed length (accessed with the .length property)
//        that must be defined when they are created.
        prices = new double[4];
        System.out.println("Number of elements in [prices] array: " + prices.length);

//        The size of the array can be either a literal (like in the example above), a constant, or a variable.
        final int Number_Of_Beatles = 4;
        ArrayLesson[] theBeatles = new ArrayLesson[Number_Of_Beatles];
        System.out.println("Number of elements in [theBeatles] array: " + theBeatles.length);
//        Here we define a variable named theBeatles whose type is an array where
//        each element has the type of ArrayLesson. When we assign to the variable,
//        we create a new array where the size is determined by a constant
//        defined beforehand.

        int numberOfBugs = (int) Math.floor(Math.random() * 100);
        int[] myCode = new int [numberOfBugs];
        System.out.println("Array length is now: " + myCode.length);
//        the size of the myCode array is determined by a variable defined ahead
//        of time. In this example, the size of the array is determined by a
//        random number.


//        Elements of an array are defined by their index, their position in the
//        array, starting at 0. Any elements that have not been initialized will
//        have that type's default value (see the table below). Referring to an
//        index that outside the range of the array will cause an
//        ArrayIndexOutOfBoundsException.
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(numbers[0]); // prints out 1
        System.out.println(numbers[1]); // prints out 2
        System.out.println(numbers[2]); // prints out 0  -- default value
//      System.out.println(numbers[3]); // gives an ArrayIndexOfBoundsException !!!

        // using the array initializer syntax
        String[] beatles = {"John", "Paul", "Ringo"};

        System.out.println(beatles.length); // 3

        System.out.println(beatles[0]); // "John"
        System.out.println(beatles[1]); // "Paul"
        System.out.println(beatles[2]); // "Ringo"
        for(var i = 0; i <= beatles.length - 1; i++){
            System.out.println("Beatles name: " + beatles[i] + "index number: " + i);
        }

//  ArrayIndexOutOfBoundsException !
       // beatles[3] = "George";

        // Iterating
        String[] languages = {"html", "css", "javascript", "java"};

//  use the length property of any array in combination with a looping construct
//  object to iterate over it.
        for(int i = 0; i < languages.length; i += 1){
            System.out.println(languages[i]);
        }

//  In addition to the traditional for loop, Java provides an enhanced for that is
//  similar to a forEach in JavaScript. It is useful when we want to do something
//  for every item in an array.

//                  element :  array
        for (String language : languages){
            System.out.println(language);
        }

//  When using the enhanced for, we must specify what collection we are iterating
//  over, a variable to hold each element, and the type of each element in the
//  collection.

        int[] nums = {1, 2, 3, 4, 5};

        for (int n : nums){
            System.out.println(n);
        }
//  Here, each element of the numbers array will be assigned to the variable n,
//  whose type is int, every loop iteration.


    // The Arrays Class
//  The java.util.Arrays class contains static methods for common array manipulation
//  tasks. All methods can accept arrays of primitive data types or of objects,
//  and all index arguments must be of the type int.

//        *** void Arrays.fill(arrayName, value) ***

//        Fills all elements of the specified array with the specified value.

//        *** boolean Arrays.equals(array1, array2)  ***

//        Returns true if both arrays are of the same type and all of the
//        elements within the arrays are equal to each other.

//        *** array Arrays.copyOf(array, length)  ***

//        Returns a copy of the given array with the specified length.

//        *** String Arrays.toString(array)  ***

//        Returns a string representation of the array.

//        *** void Arrays.sort(array) ***

//        Sorts the elements of an array into ascending order.


    // Two - Dimensional Arrays - (an array that holds arrays)
//  we can define an array whose elements are themselves arrays. This is called
//  a two-dimensional array, or a matrix. You can think of a two-dimensional
//  array like a grid, with rows and columns.

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //      (array(row)(element))
        System.out.println(matrix[1][0]);   // 4 --> access the first element in the second row
        System.out.println(matrix[0][2]);   // 3 --> the last element in the first row
        System.out.println(matrix[2][0]);   // 7 --> the first element in the last row


        for (int[] row : matrix){
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row){
                System.out.print(n + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");


        // array static method - Arrays.copyOf(array to copy, length)
        String[] testCopy = Arrays.copyOf(languages, 2);
        for (String element: testCopy){
            System.out.println(element);
        }
        System.out.println(testCopy.length);
    }
}
