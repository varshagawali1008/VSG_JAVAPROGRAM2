package Collection;

import java.util.HashMap;
import java.util.Map;

public class EqualsExample {
    public static void main(String[] args) {
        // Create two HashMaps
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        // Add some key-value pairs to the first HashMap
        map1.put("Alice", 25);
        map1.put("Bob", 30);
        
        // Add the same key-value pairs to the second HashMap
        map2.put("Alice", 25);
        map2.put("Bob", 30);

        // Display both HashMaps
        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);

        // Check if the two maps are equal
        boolean areEqual = map1.equals(map2);
        
        // Display the result
        if (areEqual) {
            System.out.println("Map 1 is equal to Map 2.");
        } else {
            System.out.println("Map 1 is not equal to Map 2.");
        }

        // Modify map2 to demonstrate the inequality
        map2.put("Charlie", 35);

        // Check again if the two maps are equal
        areEqual = map1.equals(map2);
        
        // Display the result
        if (areEqual) {
            System.out.println("Map 1 is equal to Map 2 after modification.");
        } else {
            System.out.println("Map 1 is not equal to Map 2 after modification.");
        }
    }
}
