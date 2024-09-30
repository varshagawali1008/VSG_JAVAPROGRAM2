package Collection;

import java.util.ArrayList;

public class SetExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add some elements to the ArrayList
        list.add("First Element");
        list.add("Second Element");
        list.add("Third Element");

        // Display the original list
        System.out.println("Original List: " + list);

        // Replace the element at index 1 with a new element
        String oldElement = list.set(1, "Modified Second Element");

        // Display the replaced element and the updated list
        System.out.println("Replaced Element: " + oldElement);
        System.out.println("Updated List: " + list);

        // Trying to set an element at an invalid index
        try {
            list.set(10, "Invalid Index Element");  // This will throw IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

