package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class HeadSetExample {
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

        // Get a headSet containing elements less than 30
        SortedSet<Integer> headSet = sortedSet.headSet(30);

        // Display the headSet
        System.out.println("HeadSet (elements < 30): " + headSet);

        // Modify the original set and show the effect on the headSet
        sortedSet.add(25);
        System.out.println("Updated Original SortedSet: " + sortedSet);
        System.out.println("Updated HeadSet (elements < 30): " + headSet);
    }
}

