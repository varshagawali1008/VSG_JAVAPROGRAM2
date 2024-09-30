package Collection;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ValuesExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Display the original HashMap
        System.out.println("Original HashMap: " + map);

        // Use values() to get a collection of values
        Collection<Integer> values = map.values();

        // Display the collection of values
        System.out.println("Values in the HashMap: " + values);

        // Iterating over the collection of values
        System.out.println("Iterating over the values:");
        for (Integer value : values) {
            System.out.println("Value: " + value);
        }

        // Modifying a value (in this case, the value of Alice)
        map.put("Alice", 28); // Updating Alice's age
        System.out.println("HashMap after updating Alice's age: " + map);

        // Display the values again
        values = map.values();
        System.out.println("Updated Values in the HashMap: " + values);
    }
}
