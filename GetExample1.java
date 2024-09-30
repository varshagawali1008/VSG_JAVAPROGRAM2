package Collection;

import java.util.HashMap;
import java.util.Map;

public class GetExample1 {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Display the original HashMap
        System.out.println("Original HashMap: " + map);

        // Retrieve a value using a key
        String keyToGet = "Bob";
        Integer value = map.get(keyToGet);

        // Display the result
        if (value != null) {
            System.out.println("Value associated with key '" + keyToGet + "': " + value);
        } else {
            System.out.println("Key '" + keyToGet + "' not found in the HashMap.");
        }

        // Attempt to retrieve a value using a key that doesn't exist
        keyToGet = "Eve";
        value = map.get(keyToGet);
        
        // Display the result
        if (value != null) {
            System.out.println("Value associated with key '" + keyToGet + "': " + value);
        } else {
            System.out.println("Key '" + keyToGet + "' not found in the HashMap.");
        }
    }
}
