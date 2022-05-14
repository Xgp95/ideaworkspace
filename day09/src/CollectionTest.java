import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("abc");
        collection.add("abc123");
        collection.add("12c");
        collection.add("a345");
        collection.add("15bc");
        System.out.println(collection);
        List<String> list = Arrays.asList(new String[collection.size()]);
        Collections.copy(list, collection);
        System.out.println(list);
    }
}
