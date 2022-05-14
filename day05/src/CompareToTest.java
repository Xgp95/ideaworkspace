import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareToTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[5];

        arr[0] = new Goods("lianxiangshubiao", 340);
        arr[1] = new Goods("luojishubiao", 34);
        arr[2] = new Goods("huaweishubiao", 30);
        arr[3] = new Goods("shuangfeiyanshubiao", 40);
        arr[4] = new Goods("lianxiangshubiao", 39);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void comparatorTest() {
        String[] arr1 = new String[]{"AA", "BB", "rr", "cf", "dt"};
        Goods[] arr = new Goods[5];

        arr[0] = new Goods("lianxiangshubiao", 340);
        arr[1] = new Goods("luojishubiao", 34);
        arr[2] = new Goods("huaweishubiao", 30);
        arr[3] = new Goods("shuangfeiyanshubiao", 40);
        arr[4] = new Goods("lianxiangshubiao", 39);
        Arrays.sort(arr1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return s1.compareTo(s2);
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr1));
        System.out.println("************");
        Arrays.sort(arr, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Goods && o2 instanceof Goods) {
                    Goods g1 = (Goods) o1;
                    Goods g2 = (Goods) o2;

                    if (g1.getName().equals(g2.getName())) {
                        return Double.compare(g1.getPrice(), g2.getPrice());
                    } else {
                        return -g1.getName().compareTo(g2.getName());
                    }
                }
//                return 0;
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}


