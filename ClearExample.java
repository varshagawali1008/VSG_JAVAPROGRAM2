package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class ClearExample {
    public static void main(String[] args) {
        // Create a SortedSet using TreeSet
        SortedSet<Integer> sortedSet = new TreeSet<>();

        // Add some elements to the SortedSet
        sortedSet.add(10);
        sortedSet.add(20);
        sortedSet.add(30);
        sortedSet.add(40);
        sortedSet.add(50);

        // Display the original SortedSet
        System.out.println("Original SortedSet: " + sortedSet);

        // Clear the SortedSet
        sortedSet.clear();

        // Display the SortedSet after clearing
        System.out.println("SortedSet after clear(): " + sortedSet);
        
        // Check if the set is empty
        if (sortedSet.isEmpty()) {
            System.out.println("The SortedSet is now empty.");
        } else {
            System.out.println("The SortedSet is not empty.");
        }
    }
}
