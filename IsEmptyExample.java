package Collection;

import java.util.HashMap;
import java.util.Map;

public class IsEmptyExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Check if the map is empty
        System.out.println("Is the HashMap empty? " + map.isEmpty());

        // Add some key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);

        // Display the original HashMap
        System.out.println("Original HashMap: " + map);

        // Check if the map is empty again
        System.out.println("Is the HashMap empty? " + map.isEmpty());

        // Clear the HashMap
        map.clear();

        // Check if the map is empty after clearing
        System.out.println("Is the HashMap empty after clearing? " + map.isEmpty());
    }
}

