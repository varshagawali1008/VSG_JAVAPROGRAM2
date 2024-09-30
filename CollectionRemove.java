import java.util.ArrayList;
import java.util.Collection;

public class CollectionRemove {

    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("Original collection: " + fruits);

        boolean isRemoved = fruits.remove("Banana");
        System.out.println("Was 'Banana' removed? " + isRemoved);
        System.out.println("Updated collection: " + fruits);

        isRemoved = fruits.remove("Grapes");
        System.out.println("Was 'Grapes' removed? " + isRemoved);
    }
}

