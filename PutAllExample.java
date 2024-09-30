package Collection;


import java.util.HashMap;
import java.util.Map;

public class PutAllExample {
    public static void main(String[] args) {
        // Create the first HashMap
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Alice", 25);
        map1.put("Bob", 30);

        // Create the second HashMap
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Charlie", 35);
        map2.put("David", 40);

        // Display the original HashMaps
        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);

        // Use putAll to copy all mappings from map2 to map1
        map1.putAll(map2);

        // Display the updated map1 after putAll
        System.out.println("Map 1 after putAll from Map 2: " + map1);

        // Adding a conflicting key to demonstrate value replacement
        map1.put("Alice", 28); // Updating Alice's age
        System.out.println("Map 1 after updating Alice's age: " + map1);
    }
}
