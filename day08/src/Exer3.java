import java.io.File;

public class Exer3 {
    //    static int count = 0;
    public static void main(String[] args) {

        File file = new File("F:\\data");
        int jgpCount = findJGP(file);
        System.out.println("*****************************");
        System.out.println(file.getAbsoluteFile() + "\n目录下一共有" + jgpCount + "个.txt结尾的文件");
    }

    public static int findJGP(File file) {
        int count = 0;
        if (file.isFile()) {
            String name = file.getName();
            if (name.endsWith(".txt")) {
                System.out.println(file.getAbsolutePath());
                count++;
            }
        } else {
            File[] files = file.listFiles();
            for (File dir : files) {
                count += findJGP(dir);
            }
        }
        return count;
    }
}
