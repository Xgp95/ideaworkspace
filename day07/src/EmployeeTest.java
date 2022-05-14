import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {
    @Test
    public void EmployeeTest2() {
        Employee emp0 = new Employee("zhangsan", 18, new MyDate(1991, 1, 20));
        Employee emp1 = new Employee("lisi", 19, new MyDate(1992, 5, 21));
        Employee emp2 = new Employee("wangwu", 28, new MyDate(1995, 5, 18));
        Employee emp3 = new Employee("zhaoliu", 38, new MyDate(1989, 3, 25));
        Employee emp4 = new Employee("maqi", 59, new MyDate(1991, 1, 10));

        TreeSet<Employee> ts = new TreeSet(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }

//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Employee && o2 instanceof Employee) {
//                    Employee emp1 = (Employee) o1;
//                    Employee emp2 = (Employee) o2;
//                    return emp1.getBirthday().compareTo(emp2.getBirthday());
//                }
//                throw new RuntimeException("输入的类型不一致！");
//            }
        });

        ts.add(emp0);
        ts.add(emp2);
        ts.add(emp1);
        ts.add(emp3);
        ts.add(emp4);

        Iterator<Employee> iterator = ts.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void EmployeeTest1() {
        Employee emp0 = new Employee("zhangsan", 18, new MyDate(1991, 1, 20));
        Employee emp1 = new Employee("lisi", 19, new MyDate(1992, 5, 21));
        Employee emp2 = new Employee("wangwu", 28, new MyDate(1995, 5, 18));
        Employee emp3 = new Employee("zhaoliu", 38, new MyDate(1989, 3, 25));
        Employee emp4 = new Employee("maqi", 59, new MyDate(1991, 1, 10));

        TreeSet<Employee> ts = new TreeSet<>();
        ts.add(emp0);
        ts.add(emp2);
        ts.add(emp1);
        ts.add(emp3);
        ts.add(emp4);
        for (Employee emp : ts) {
            System.out.println(emp);
        }
    }


}
