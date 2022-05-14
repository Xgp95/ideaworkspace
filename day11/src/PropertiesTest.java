import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    @Test
    public void test() throws IOException {
        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream("src\\jdbc.properties");
        pros.load(fis);
//        ClassLoader classLoader = PropertiesTest.class.getClassLoader();
//        InputStream ras = classLoader.getResourceAsStream("jdbc.properties");
//        pros.load(ras);
        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println("user = " + user);
        System.out.println("password = " + password);


    }
}
