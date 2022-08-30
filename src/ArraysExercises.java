import util.Input;

import java.sql.Array;
import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person persons[], Person person){
            //   Array type          Object Array ,    Object Person
        System.out.println(persons.length);  // check lenght of array

        // new array or copy of array created / referenced by same name, if you
        // try to create a new array, will give you an error because new array element will
        // will return null, so pass in the same name array since it s a copy
        persons = Arrays.copyOf(persons, persons.length + 1);
        // Array type Person - name of new array = Arrays Method ( array, array.length +1 is the new length) making room for new object
        persons[persons.length -1] = person;
        // new Array [array.length - 1 (last spot of array)] = object passed into method
        System.out.println(persons.length);  // check length - is it longer than passed array

        System.out.println(persons.length);
        for(int i = 0; i < persons.length; i++){
            System.out.println(persons[i].getName());
        }
        System.out.println(persons.length);
        return persons;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);  // prints out the location array is saved in memory
        System.out.println(Arrays.toString(numbers)); // formats out to display numbers array

        Person[] personList = new Person[3];
        personList[0] =  new Person("ethan");
        personList[1] = new Person("kathy");
        personList[2] = new Person("alfonso");

        for(int i = 0; i < personList.length; i++){
            System.out.println(personList[i].getName());
        }
        Person bella = new Person("bella");



        addPerson(personList, bella );

    }
}
