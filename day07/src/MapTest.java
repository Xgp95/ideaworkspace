import org.junit.Test;

import java.util.*;

public class MapTest {
    @Test
    public void test() {
        Map map = new HashMap();
        map.put("aa", 123);
        map.put("ab", 4);
        map.put("ac", "AA");
        map.put("ad", "true");
        map.put("ae", false);
        map.put("af", 7788);
        System.out.println(map);

        Set set = map.keySet();
        System.out.println("**************");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collection values = map.values();
        System.out.println("**************");
        for (Object obj : values) {
            System.out.println(obj);
        }

        System.out.println("**************");
        Set set1 = map.entrySet();
        for (Object obj : set1) {
            System.out.println(obj);
        }
    }

    @Test
    public void test1() {
        Map map = new HashMap();
        map.put("aa", 123);
        map.put("ab", 4);
        map.put("ac", "AA");
        map.put("ad", "true");
        map.put("ae", false);
        map.put("af", 7788);

//        Set set = map.entrySet();
//        for (Object obj : set) {
//            Map.Entry entry = (Map.Entry) obj;
//            System.out.println(entry.getKey() + "=====>" + entry.getValue());
//        }
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//            Map.Entry entry = (Map.Entry) iterator.next();
//            System.out.println(entry.getKey() + "=====>" + entry.getValue());
//        }

        Set set = map.keySet();

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            Object value = map.get(key);

            System.out.println(key + "**************>" + value);

        }
    }
}
