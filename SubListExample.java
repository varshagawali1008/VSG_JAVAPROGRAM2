package Collection;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add some elements to the ArrayList
        list.add("First Element");
        list.add("Second Element");
        list.add("Third Element");
        list.add("Fourth Element");
        list.add("Fifth Element");

        // Display the original list
        System.out.println("Original List: " + list);

        // Create a sublist from index 1 to index 4
        List<String> subList = list.subList(1, 4);

        // Display the sublist
        System.out.println("Sublist (from index 1 to 4): " + subList);

        // Modify an element in the sublist
        subList.set(0, "Modified Second Element");

        // Display the modified sublist and original list after modification
        System.out.println("Modified Sublist: " + subList);
        System.out.println("Original List after modifying Sublist: " + list);

        // Trying to create a sublist with invalid indices
        try {
            List<String> invalidSubList = list.subList(2, 10); // This will throw IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

