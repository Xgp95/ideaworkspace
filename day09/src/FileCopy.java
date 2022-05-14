import org.junit.Test;

import java.io.*;

public class FileCopy {
    public void fileCopy(File fileSrc, File fileDest) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(fileSrc);
            fos = new FileOutputStream(fileDest);

            byte[] bytes = new byte[4096];//1024时copy用时28642毫秒，2048时copy用时13737毫秒，512时copy用时38799毫秒
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {

                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    @Test
    public void test() {
        File fileSrc = new File("D:\\My Documents\\Desktop\\01.mp4");
        File fileDest = new File("D:\\My Documents\\Desktop\\02.mp4");
        long start = System.currentTimeMillis();
//        fileCopy("D:\\My Documents\\Desktop\\01.mp4", "D:\\My Documents\\Desktop\\02.mp4");
        fileCopy(fileSrc, fileDest);
        long end = System.currentTimeMillis();
        System.out.println("copy用时" + (end - start) + "毫秒");
    }
}
