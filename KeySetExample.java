package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeySetExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Display the original HashMap
        System.out.println("Original HashMap: " + map);

        // Get the set of keys from the HashMap
        Set<String> keys = map.keySet();

        // Display the set of keys
        System.out.println("Keys in the HashMap: " + keys);

        // Iterate over the key set
        System.out.println("Iterating over the keys:");
        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
