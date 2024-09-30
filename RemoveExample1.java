package Collection;

import java.util.HashMap;
import java.util.Map;

public class RemoveExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Display the original HashMap
        System.out.println("Original HashMap: " + map);

        // Remove a key-value pair using the remove() method
        Integer removedValue = map.remove("Bob");
        
        // Display the value that was removed
        System.out.println("Removed value for key 'Bob': " + removedValue);
        
        // Display the HashMap after removal
        System.out.println("HashMap after removing Bob: " + map);

        // Attempting to remove a non-existing key
        removedValue = map.remove("David");
        System.out.println("Removed value for key 'David': " + removedValue); // Should be null
    }
}

