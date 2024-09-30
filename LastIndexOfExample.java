
import java.util.ArrayList;

public class LastIndexOfExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add some elements to the ArrayList, including duplicates
        list.add("First Element");
        list.add("Second Element");
        list.add("Third Element");
        list.add("Second Element");  // Duplicate element
        list.add("Fourth Element");

        // Display the list
        System.out.println("List: " + list);

        // Use the lastIndexOf(Object obj) method to find the last occurrence of an element
        int lastIndex1 = list.lastIndexOf("Second Element");  // Finds the last occurrence of "Second Element"
        int lastIndex2 = list.lastIndexOf("Third Element");   // Finds the last occurrence of "Third Element"
        int lastIndex3 = list.lastIndexOf("Nonexistent Element"); // Element not in list

        // Display the results
        System.out.println("Last index of 'Second Element': " + lastIndex1);
        System.out.println("Last index of 'Third Element': " + lastIndex2);
        System.out.println("Last index of 'Nonexistent Element': " + lastIndex3);
    }
}
