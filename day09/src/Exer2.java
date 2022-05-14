import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exer2 {


    public static void main(String[] args){
        BufferedReader bfr = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);

            bfr = new BufferedReader(isr);

            System.out.println("请输入要转换的字符,输入e或者exit退出");

            while (true){
                String data = bfr.readLine();
                if((data.equalsIgnoreCase("e")) || (data.equalsIgnoreCase("exit"))){
                    System.out.println("结束");
                    break;
                }
                System.out.println(data.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bfr != null){

                try {
                    bfr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
