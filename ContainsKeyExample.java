package Collection;

import java.util.HashMap;
import java.util.Map;

public class ContainsKeyExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Display the original HashMap
        System.out.println("Original HashMap: " + map);

        // Check if the map contains a specific key
        String keyToCheck = "Bob";
        boolean containsKey = map.containsKey(keyToCheck);

        // Display the result
        if (containsKey) {
            System.out.println("The HashMap contains the key: " + keyToCheck);
        } else {
            System.out.println("The HashMap does not contain the key: " + keyToCheck);
        }

        // Check for a key that doesn't exist
        keyToCheck = "Eve";
        containsKey = map.containsKey(keyToCheck);
        
        if (containsKey) {
            System.out.println("The HashMap contains the key: " + keyToCheck);
        } else {
            System.out.println("The HashMap does not contain the key: " + keyToCheck);
        }
    }
}
