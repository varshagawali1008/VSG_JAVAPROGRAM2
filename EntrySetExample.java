package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySetExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Display the original HashMap
        System.out.println("Original HashMap: " + map);

        // Get the entry set from the map
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // Display the entry set
        System.out.println("Entry Set: " + entrySet);

        // Iterate over the entry set
        System.out.println("Iterating over the entry set:");
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
