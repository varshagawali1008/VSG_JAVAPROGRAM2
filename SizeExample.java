package Collection;

import java.util.HashMap;
import java.util.Map;

public class SizeExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Display the initial size of the HashMap
        System.out.println("Initial size of the HashMap: " + map.size());

        // Adding key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Display the size after adding elements
        System.out.println("Size of the HashMap after adding elements: " + map.size());

        // Removing a key-value pair
        map.remove("Bob");

        // Display the size after removal
        System.out.println("Size of the HashMap after removing Bob: " + map.size());

        // Clearing the HashMap
        map.clear();

        // Display the size after clearing
        System.out.println("Size of the HashMap after clearing: " + map.size());
    }
}
