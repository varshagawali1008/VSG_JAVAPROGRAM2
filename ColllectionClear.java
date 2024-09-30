import java.util.ArrayList;
import java.util.Collection;

public class CollectionClear {

    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits before clear: " + fruits);

        fruits.clear();

        System.out.println("Fruits after clear: " + fruits);
    }
}
