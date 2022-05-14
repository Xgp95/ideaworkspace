import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Exer2 {
    @Test
    public void test() {
        File file = new File("Horld.txt");
        boolean b = deleteFile(file);

    }

    public boolean deleteFile(File file) {
        if (file.exists()) {
            file.delete();
            System.out.println("删除成功");
            return true;
        }
        return false;
    }

    @Test
    public void exer() throws IOException {
        File file = new File("Holle World!.txt");
        File file1 = new File("Hi.txt");
        File file2 = new File("Hd.txt");
        File file3 = new File("Hld.txt");
        File file4 = new File("Horld.txt");
        if (!(file.exists())) {
            file.createNewFile();
        }
        if (!(file1.exists())) {
            file1.createNewFile();
        }
        if (!(file2.exists())) {
            file2.createNewFile();
        }
        if (!(file3.exists())) {
            file3.createNewFile();
        }
        if (!(file4.exists())) {
            file4.createNewFile();
        }
    }
}
