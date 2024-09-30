package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorWithIndexExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add some elements to the ArrayList
        list.add("First Element");
        list.add("Second Element");
        list.add("Third Element");
        list.add("Fourth Element");

        // Display the list
        System.out.println("Original List: " + list);

        // Get the ListIterator starting from index 2
        ListIterator<String> iterator = list.listIterator(2);

        // Traverse the list in the forward direction starting from index 2
        System.out.println("Traversing from index 2 in forward direction:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
        }

        // Traverse the list in the backward direction starting from the end
        System.out.println("Traversing in backward direction:");
        while (iterator.hasPrevious()) {
            String element = iterator.previous();
            System.out.println("Element: " + element);
        }

        // Modify elements starting from index 2
        System.out.println("Modifying the third element...");
        iterator = list.listIterator(2); // Reset the iterator to index 2
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Third Element")) {
                iterator.set("Modified Third Element");
            }
        }

        // Display the modified list
        System.out.println("Modified List: " + list);
    }
}
