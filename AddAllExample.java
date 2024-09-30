import java.util.ArrayList;
import java.util.Collection;

public class AddAllExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list1 = new ArrayList<>();

        // Add some elements to the first list
        list1.add("First");
        list1.add("Second");
        list1.add("Third");

        // Display the initial list
        System.out.println("Initial List 1: " + list1);

        // Create another Collection (could be any Collection, here we use ArrayList)
        Collection<String> list2 = new ArrayList<>();
        list2.add("Inserted1");
        list2.add("Inserted2");
        list2.add("Inserted3");

        // Display the second list
        System.out.println("Collection to add (List 2): " + list2);

        // Use addAll(int index, Collection c) to insert list2 at index 1
        list1.addAll(1, list2);

        // Display the list after insertion
        System.out.println("List 1 after addAll: " + list1);
    }
}

