package Collection;
import java.util.ArrayList;

public class IndexOfExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add some elements to the ArrayList
        list.add("First Element");
        list.add("Second Element");
        list.add("Third Element");
        list.add("Second Element");  // Duplicate element

        // Display the list
        System.out.println("List: " + list);

        // Use the indexOf(Object obj) method to find the index of an element
        int index1 = list.indexOf("Second Element");  // Finds the first occurrence
        int index2 = list.indexOf("Third Element");   // Finds the element
        int index3 = list.indexOf("Nonexistent Element"); // Element not in list

        // Display the results
        System.out.println("Index of 'Second Element': " + index1);
        System.out.println("Index of 'Third Element': " + index2);
        System.out.println("Index of 'Nonexistent Element': " + index3);
    }
}

