import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExer1 {
    @Test
    public void timeExer() throws ParseException {
        String str = "2020-09-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date date = new java.sql.Date(sdf.parse(str).getTime());

        System.out.println(date);
    }

    @Test
    public void timeExer1() throws ParseException {
        String str = "1990-01-01";
        String str1 = "2020-09-9";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        Date date1 = sdf.parse(str1);

        int i = ((int) ((date1.getTime() - date.getTime()) / (24 * 60 * 60 * 1000))) + 1;
        int num = i % 5;
        System.out.println(i);
        System.out.println(num);
        switch (num) {
            case 1:
            case 2:
            case 3:
                System.out.println("打鱼");
                break;
            case 4:
            case 0:
                System.out.println("晒网");
                break;
        }

    }
}
