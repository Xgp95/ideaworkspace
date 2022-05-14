import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class Exer1 {

    @Test
    public void test() {
        TreeSet stu = new TreeSet();
        stu.add(new Student("张三", 100, 6));
        stu.add(new Student("李四", 10, 10));
        stu.add(new Student("王五", 70, 11));
        stu.add(new Student("赵柳", 65, 61));
        stu.add(new Student("张明", 100, 60));
        Iterator iterator = stu.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for (int i = 0; i < 3; i++) {
            System.out.println(iterator.next());
        }
    }
}

class Student implements Comparable {
    String name;
    double score;
    int id;

    public Student() {
    }

    public Student(String name, double score, int id) {
        this.name = name;
        this.score = score;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student stu = (Student) o;
            if (this.score == stu.score) {
                return Integer.compare(this.id, stu.id);
            } else {
                return -Double.compare(this.score, stu.score);
            }
        }
        throw new RuntimeException("类型不一致");
    }
}