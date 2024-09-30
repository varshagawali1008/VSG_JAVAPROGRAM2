package Collection;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add some elements to the ArrayList
        list.add("First Element");
        list.add("Second Element");
        list.add("Third Element");
        list.add("Fourth Element");

        // Display the original list
        System.out.println("Original List: " + list);

        // Remove an element at index 1
        String removedElement = list.remove(1);

        // Display the removed element and the updated list
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Updated List after removal: " + list);

        // Trying to remove an element at an invalid index
        try {
            list.remove(10); // This will throw IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
