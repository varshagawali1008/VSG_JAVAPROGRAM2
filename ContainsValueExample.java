package Collection;

import java.util.HashMap;
import java.util.Map;

public class ContainsValueExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Display the original HashMap
        System.out.println("Original HashMap: " + map);

        // Check if the map contains a specific value
        Integer valueToCheck = 30;
        boolean containsValue = map.containsValue(valueToCheck);

        // Display the result
        if (containsValue) {
            System.out.println("The HashMap contains the value: " + valueToCheck);
        } else {
            System.out.println("The HashMap does not contain the value: " + valueToCheck);
        }

        // Check for a value that doesn't exist
        valueToCheck = 40;
        containsValue = map.containsValue(valueToCheck);
        
        if (containsValue) {
            System.out.println("The HashMap contains the value: " + valueToCheck);
        } else {
            System.out.println("The HashMap does not contain the value: " + valueToCheck);
        }
    }
}
