package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class LastElementExample {
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

        // Get the last element
        Integer lastElement = sortedSet.last();

        // Display the last element
        System.out.println("Last Element: " + lastElement);
        
        // Removing the last element
        sortedSet.remove(lastElement);
        System.out.println("SortedSet after removing the last element: " + sortedSet);
    }
}
