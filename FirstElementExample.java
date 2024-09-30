package Collection;

import java.util.ArrayList;
import java.util.List;

public class FirstElementExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> list = new ArrayList<>();

        // Add some elements to the ArrayList
        list.add("First Element");
        list.add("Second Element");
        list.add("Third Element");

        // Display the original list
        System.out.println("Original List: " + list);

        // Get the first element
        String firstElement = getFirstElement(list);

        // Display the first element
        if (firstElement != null) {
            System.out.println("First Element: " + firstElement);
        } else {
            System.out.println("The list is empty.");
        }
    }

    // Custom method to get the first element
    public static <T> T getFirstElement(List<T> list) {
        if (list.isEmpty()) {
            return null; // Or throw an exception based on your needs
        }
        return list.get(0);
    }
}
