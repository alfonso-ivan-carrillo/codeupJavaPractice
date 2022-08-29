import util.Input;

import java.sql.Array;
import java.util.Arrays;

public class ArraysExercises {

//    public static Object addPerson(Array list, Object Person){
//        Person[] newList = list;
//    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);  // prints out the location array is saved in memory
        System.out.println(Arrays.toString(numbers)); // formats out to display numbers array

        Person[] personList = new Person[3];
        personList[0] =  new Person("ethan");
        personList[1] = new Person("kathy");
        personList[2] = new Person("alfonso");

        for(int i = 0; i < personList.length; i++){
            System.out.println(personList[i].name);
        }

    }
}
