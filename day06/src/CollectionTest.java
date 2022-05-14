import org.junit.Test;

import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }
}
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add("CC");
        coll.add("DD");

        Object[] obj = coll.toArray();
//        System.out.println(Arrays.toString(obj));

        List<Object> list = Arrays.asList(obj);

        System.out.println(list);
    }

    @Test
    public void test(){
        Collection coll = new ArrayList();
        Collection coll1 = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Tom",18));
        coll.add(new Date());
        coll.add(true);
        coll.add("Tom");
        coll1.add(new Date());
        coll1.add("BB");
//        System.out.println(coll.size());
//
        coll.addAll(coll1);

//        System.out.println(coll.size());
        System.out.println(coll);

//        coll1.clear();
//        System.out.println(coll1.isEmpty());

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if(obj.equals("Tom")){
               iterator.remove();
            }
        }
        Iterator iterator1 = coll.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
