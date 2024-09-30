import java.util.ArrayList;

public class GetExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add some elements to the ArrayList
        list.add("First Element");
        list.add("Second Element");
        list.add("Third Element");

        // Display the list
        System.out.println("List: " + list);

        // Use the get(int index) method to retrieve elements
        String firstElement = list.get(0); // Gets the element at index 0
        String secondElement = list.get(1); // Gets the element at index 1

        // Display the retrieved elements
        System.out.println("Element at index 0: " + firstElement);
        System.out.println("Element at index 1: " + secondElement);

        // Trying to access an element at an invalid index
        try {
            String invalidElement = list.get(5); // This will throw IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

