package Collection;

import java.util.HashMap;
import java.util.Map;

public class PutExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        System.out.println("HashMap after adding Alice and Bob: " + map);

        // Adding another key-value pair
        map.put("Charlie", 35);
        System.out.println("HashMap after adding Charlie: " + map);

        // Updating the value for an existing key
        map.put("Alice", 28); // This will update Alice's age
        System.out.println("HashMap after updating Alice's age: " + map);

        // Attempting to add a new key-value pair
        map.put("David", 40);
        System.out.println("HashMap after adding David: " + map);
        
        // Retrieving the value associated with a key
        Integer ageOfBob = map.get("Bob");
        System.out.println("Age of Bob: " + ageOfBob);
    }
}
