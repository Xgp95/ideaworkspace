import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Exer {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入10个整数,第" + (i + 1));
            int num = scanner.nextInt();
//            int num = (int) (Math.random() * 100 + 1);
            list.add(num);
        }
        Collections.sort(list);
        System.out.println(list);
    }
    @Test
    public void exer() {
        Scanner scanner = new Scanner(System.in);

        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
//            System.out.println("请输入10个整数,第" + (i + 1));
//            int num = scanner.nextInt();
            int num = (int) (Math.random() * 100 + 1);
            list.add(new Integer(num));
        }
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                return -Integer.compare((int) o1, (int) o2);
            }
        });
        System.out.println(list);
    }
}
