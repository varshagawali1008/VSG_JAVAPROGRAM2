import java.util.ArrayList;
import java.util.Collection;

public class CollectionHashCode {

    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        Collection<String> vegetables = new ArrayList<>();
        vegetables.add("Carrot");
        vegetables.add("Potato");
        vegetables.add("Cabbage");

        System.out.println("Fruits: " + fruits);
        System.out.println("Hash code of fruits: " + fruits.hashCode());

        System.out.println("Vegetables: " + vegetables);
        System.out.println("Hash code of vegetables: " + vegetables.hashCode());
    }
}
