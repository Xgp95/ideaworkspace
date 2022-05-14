package exer;

import org.junit.Test;

import java.util.List;

/*
定义一个测试类：
创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方
法来操作 User 对象，
使用 Junit 单元测试类进行测试。
 */
public class DAOTest {
    @Test
    public void test(){
        User user1 = new User(101, 18, "张三");
        User user2 = new User(102, 19, "李四");
        User user3 = new User(103, 22, "王五");
        User user4 = new User(104, 32, "赵六");
        User user5 = new User(105, 10, "马七");
        DAO<User> dao = new DAO<>();
        dao.save("101", user1);
        dao.save("102", user2);
        dao.save("103", user3);
        dao.save("104", user4);
        dao.save("105", user5);
        List<User> list = dao.list();
        list.forEach(System.out::println);
        dao.update("106", new User(106, 45, "张三"));
        dao.delete("106");

       list.forEach(System.out::println);
    }
}
