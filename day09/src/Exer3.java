import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exer3 {
    public static void main(String[] args) {
        System.out.println(MyInput.returnInt());
    }
}

class MyInput{
    public static String returnString()  {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = bfr.readLine();
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
        return str;
    }

    public static int returnInt(){
        return Integer.parseInt(returnString());
    }

    public static double returnDouble(){
        return Double.parseDouble(returnString());
    }
}



