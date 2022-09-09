import java.util.HashMap;

public class HashMapsLesson {

    // A hash map is a data structure for key-value pairs, implemented with the HashMap class in Java. These are similar
    // to objects in JavaScript. All the keys in the hash map must be of the same type, and all the values must be of
    // the same type, but the keys and the values don't necessarily have to be the same type.

    // basic methods
    // .put : set a key-value pair
    // .get : return the value associated with the given key or null
    // .getOrDefault : like .get, but with a defined value instead of null  .getOrDefault(Key, defaultValue);
    // .containsKey : check if a key exists in the map
    // .containsValue : check if a value exists in the map
    // .putIfAbsent : only set a key-value pair if it does not exist
    // .remove : remove a key-value pair from the map
    // .replace : replace a value at a given key
    // .clear : empty the map
    // .isEmpty : check if the map is empty
    // .keyset : used to create a set out of the key elements contained in the HashMap

    public static void main(String[] args) {
        // hashmap   HashMap<key, value> hashmapName = new HashMap<>();
        HashMap<String, String> usernames = new HashMap<>();
        // putting data into hashmap
        usernames.put("Alfonso", "Carrillo");
        usernames.put("Kathy", "Maddocks");
        usernames.put("Ethan", "Carrillo");
        usernames.put("Bella", "Maddocks");
        System.out.println(usernames);  // prints out {Kathy=Maddocks, Ethan=Carrillo, Alfonso=Carrillo, Bella=Maddocks}

        // obtaining values from the hash map by key
        System.out.println(usernames.get("Alfonso"));   // prints out "Carrillo"
        System.out.println(usernames.get("Ethan"));     // prints out "Carrillo"
        System.out.println(usernames.get("SweetPea"));  // prints out null

        System.out.println(usernames.getOrDefault("Alfonso", "Poncho")); // prints "Carrillo" since key was found
        System.out.println(usernames.getOrDefault("Buster", "Poncho")); // prints "Poncho" since "buster was not found

        System.out.println(usernames.containsKey("Ethan"));         // prints TRUE
        System.out.println(usernames.containsValue("Carrillo"));    // prints TRUE

        usernames.put("Jack", "Jack Jack"); // adds "jack", "jack jack" to arrayList
        System.out.println(usernames);

        usernames.putIfAbsent("Alfonso", "Carrillo");   // puts if arrayList if not present -- doesn't add this one
                                                        // it is case-sensitive so if spelled with lower case would add to list
        usernames.putIfAbsent("Buster", "Maddocks");    // adds because it wasn't there
        System.out.println(usernames);

        usernames.remove("Buster"); // search arralist by key and removes if present
        System.out.println(usernames);

        usernames.clear();  // clears ArrayList
        System.out.println(usernames.isEmpty()); // returns true

        System.out.println(usernames);  // {}


    }
}
