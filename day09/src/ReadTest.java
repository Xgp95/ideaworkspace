import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadTest {
    @Test
    public void test(){
        File file = new File("HelloWorld.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            char[] cbuf = new char[5];
            int len;
            StringBuffer buffer = new StringBuffer();
            while ((len = fr.read(cbuf)) != -1){
                buffer.append(cbuf, 0, len);
            }

            System.out.println(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null)
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }


    @Test
    public void test2(){
        File dest = new File("dest.txt");
        File src = new File("HelloWorld.txt");

        FileWriter fw = null;
        FileReader fr = null;
        try {
            fw = new FileWriter(dest,true);
            fr = new FileReader(src);

            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1){
                fw.write(cbuf, 0, len);
            }
            fw.write("\nGood morning!\n");
            fw.write("Good day");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
