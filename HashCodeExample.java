import java.util.HashMap;
import java.util.Map;

public class HashCodeExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Display the original HashMap
        System.out.println("Original HashMap: " + map);

        // Calculate and display the hash code of the HashMap
        int hashCode = map.hashCode();
        System.out.println("Hash code of the HashMap: " + hashCode);
        
        // Create another HashMap with the same content
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Alice", 25);
        map2.put("Bob", 30);
        map2.put("Charlie", 35);

        // Check if both maps are equal and display their hash codes
        System.out.println("Map 1 equals Map 2: " + map.equals(map2));
        System.out.println("Hash code of Map 2: " + map2.hashCode());
    }
}

