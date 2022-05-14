import org.junit.Test;

public class Exer {
   @Test
    public void test() throws ClassNotFoundException {
       Class<Person> clazz = Person.class;
       System.out.println(clazz);
       System.out.println("*******");
       Person tom = new Person("Tom", 18);
       Class calzz1 = tom.getClass();
       System.out.println(calzz1);
       System.out.println("*******");
       Class clazz2 = Class.forName("Person");
       System.out.println(clazz2);
   }
}
