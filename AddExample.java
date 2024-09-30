package Collection;
import java.util.ArrayList;

public class AddExample {
    public static void main(String[] args) {
        // Create an ArrayList of Objects
        ArrayList<Object> list = new ArrayList<>();

        // Add some elements to the ArrayList
        list.add("First Element");
        list.add("Second Element");
        list.add("Third Element");

        // Display the initial list
        System.out.println("Initial List: " + list);

        // Use the add(int index, Object obj) method to add an element at a specific position
        list.add(1, "Inserted Element");

        // Display the list after insertion
        System.out.println("List after insertion: " + list);
    }
}

