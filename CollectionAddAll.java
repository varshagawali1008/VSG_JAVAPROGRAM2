import java.util.ArrayList;
import java.util.Collection;

public class CollectionAddAll {

    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        Collection<String> moreFruits = new ArrayList<>();
        moreFruits.add("Cherry");
        moreFruits.add("Date");
        moreFruits.add("Elderberry");

        System.out.println("Fruits before addAll: " + fruits);

        fruits.addAll(moreFruits);

        System.out.println("Fruits after addAll: " + fruits);
    }
}
