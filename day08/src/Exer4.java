import java.io.File;

public class Exer4 {
    public static void main(String[] args) {

        File file = new File("F:\\data\\test");

        deleteDirectory(file);
    }

    public static void deleteDirectory(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File dir : files) {
                deleteDirectory(dir);
            }
        }
        if(file.getName().endsWith(".txt")){
            file.delete();
        };
    }
}
