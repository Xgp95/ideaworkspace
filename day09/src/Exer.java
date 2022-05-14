import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exer {
    public void encode(String fileSrc, String fileDest) {
//        File fs = new File(fileSrc);
//        File fd = new File(fileDest);
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(fileSrc);
            fos = new FileOutputStream(fileDest);

            int len;
            byte[] cbf = new byte[1024];
            while ((len = fis.read(cbf)) != -1) {
                for (int i = 0; i < len; i++) {
                    fos.write(cbf[i] ^ 5);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {

                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void decalssify(String fileSrs,String fileDest){

    }


    @Test
    public void test() {
        encode("D:\\code\\爪哇资料\\课件笔记源码资料\\1_课件\\第2部分：Java高级编程\\尚硅谷_宋红康_第13章_IO流\\Programmer Day\\001.jpg","D:\\code\\爪哇资料\\课件笔记源码资料\\1_课件\\第2部分：Java高级编程\\尚硅谷_宋红康_第13章_IO流\\Programmer Day\\0001.jpg");
    }
    @Test
    public void test1() {

    }
}
