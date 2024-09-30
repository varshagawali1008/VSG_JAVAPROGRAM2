
import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {

    private Collection<String> elements;

    // Constructor
    public CollectionExample() {
        elements = new ArrayList<>(); // Using ArrayList as the collection implementation
    }

    // Method to add an element to the collection
    public boolean add(String obj) {
        return elements.add(obj);
    }

    // Method to print the elements in the collection
    public void printCollection() {
        System.out.println("Collection contents: " + elements);
    }

    // Method to get the size of the collection
    public int size() {
        return elements.size();
    }

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();

        // Adding elements to the collection
        example.add("Apple");
        example.add("Banana");
        example.add("Cherry");

        // Print the contents of the collection
        example.printCollection();

        // Print the size of the collection
        System.out.println("Size of the collection: " + example.size());
    }
}
