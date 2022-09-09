import java.util.ArrayList;
    // ArrayList is a class that represents an array that can change its size. All elements in an ArrayList must be
    // objects, and they must have the same type. Recall that arrays in Java have a fixed length; once they are created
    // they cannot change their length. In order to "add" an item to an array, you must make a copy of the array with a
    // length bigger than the original. You can think of an ArrayList as a wrapper around the native Java array that
    // handles the details of resizing the array to add elements for you.
public class ArrayListLesson {
    // most common methods used when working with ArrayLists:
    // .size : returns the number of elements in the array
    // .add : add an element to the collection (optionally) at a specified index
    // .get : return the element at the specified index
    // .indexOf : return the first found index of the given item, or -1 if not found
    // .contains: check if a collection contains a given element / returns boolean
    // .lastIndexOf : find the last index of the given element, -1 if not found
    // .isEmpty : Check if the list is empty / returns boolean
    //  .remove : remove the first occurrence of an item, or an item at a given index

    public static void main(String[] args) {

    //  Specify the type of each element in the collection with angle brackets, (< >).
    //  Because Arraylist must contain objects, we specify INTEGER instead of int.
    //  The .add method is overloaded, we can specify either an element to add, or an element to add and index to add it too.
    //  ArrayList do not have a LENGTH property, instead we use SIZE method to found amount of elements in collection
    //  Unlike native Java ARRAYS, we can out System.out.println to show the contents of the array.Java collection, all
        // have to toString methods on them to allow us to easily inspect their contents.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);    // adding an element (20)
        numbers.add(0,21);  // adding number 21 to list at index 0
        numbers.add(22);    // adding an element (22)
        numbers.add(7);     // adding an element (7)
        numbers.add(1, 33);  // adding number 33 to list at index 1
        System.out.println(numbers);    // prints out: [21, 33, 20, 22, 7]

        System.out.println(numbers.size());;    // size (length) of numbers arraylist is 5
        System.out.println(numbers.get(2));     // prints number at index 2
        System.out.println(numbers.indexOf(20)); // prints out index of 20
        System.out.println(numbers.indexOf("cat")); // returns -1 when element not found in arraylist


        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");
        System.out.println(roasts); // prints out [light, medium, medium, dark]

        System.out.println(roasts.contains("dark"));        // returns TRUE
        System.out.println(roasts.contains("espresso"));    // returns FALSE
        System.out.println(roasts.lastIndexOf("medium")); // returns index of last element identified

        System.out.println(roasts.isEmpty());   // returns FALSE
        ArrayList<String> emptyList = new ArrayList<>();
        System.out.println(emptyList.isEmpty());    // returns TRUE

        System.out.println(roasts.remove("espresso"));  // returns FALSE
        System.out.println(roasts.remove("medium"));    // returns TRUE and removes first "medium" string found in arraylist
        System.out.println(roasts);     // prints [light, medium, dark]

        System.out.println(roasts.remove(2));   // "removes element at index 2 and prints out element in this case "dark"
        System.out.println(roasts);     // [light, medium]



    }

}
