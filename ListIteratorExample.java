
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add some elements to the ArrayList
        list.add("First Element");
        list.add("Second Element");
        list.add("Third Element");

        // Display the list
        System.out.println("Original List: " + list);

        // Get the ListIterator using listIterator() method
        ListIterator<String> iterator = list.listIterator();

        // Traverse the list in the forward direction
        System.out.println("Traversing in forward direction:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
        }

        // Traverse the list in the backward direction
        System.out.println("Traversing in backward direction:");
        while (iterator.hasPrevious()) {
            String element = iterator.previous();
            System.out.println("Element: " + element);
        }

        // Modify elements using the ListIterator
        System.out.println("Modifying the second element...");
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Second Element")) {
                iterator.set("Modified Second Element");
            }
        }

        // Display the modified list
        System.out.println("Modified List: " + list);
    }
}
