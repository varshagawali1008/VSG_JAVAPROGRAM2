package Collection;


import java.util.SortedSet;
import java.util.TreeSet;

public class SubSetExample {
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

        // Get a subSet containing elements from 20 (inclusive) to 40 (exclusive)
        SortedSet<Integer> subSet = sortedSet.subSet(20, 40);

        // Display the subSet
        System.out.println("SubSet (elements from 20 to 40): " + subSet);

        // Modify the original set and show the effect on the subSet
        sortedSet.add(25);
        System.out.println("Updated Original SortedSet: " + sortedSet);
        System.out.println("Updated SubSet (elements from 20 to 40): " + subSet);

        // Removing an element from the subSet
        subSet.remove(30);
        System.out.println("Updated Original SortedSet after removing from SubSet: " + sortedSet);
    }
}
