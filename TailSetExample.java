package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TailSetExample {
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

        // Get a tailSet containing elements from 30 (inclusive) onwards
        SortedSet<Integer> tailSet = sortedSet.tailSet(30);

        // Display the tailSet
        System.out.println("TailSet (elements >= 30): " + tailSet);

        // Modify the original set and show the effect on the tailSet
        sortedSet.add(35);
        System.out.println("Updated Original SortedSet: " + sortedSet);
        System.out.println("Updated TailSet (elements >= 30): " + tailSet);

        // Removing an element from the tailSet
        tailSet.remove(30);
        System.out.println("Updated Original SortedSet after removing from TailSet: " + sortedSet);
    }
}
