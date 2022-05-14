import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(0.155);
        doubles.add(55.0);
        doubles.add(Double.valueOf(55));
        doubles.add(Double.valueOf(155));
        doubles.add(0.15);
        Collections.sort(doubles);
        for (Double d:doubles) {
            System.out.println(d);
        }
        System.out.println("*********");


        Iterator<Double> iterator = doubles.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
