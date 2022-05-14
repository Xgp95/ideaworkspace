import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExer {
    @Test
    public void dataExer(){
        Date date = new Date();
        System.out.println(date);
        System.out.println("****");
        System.out.println(date.getTime());
        System.out.println("****");
        Date date1 = new Date(1617265459944l);
        System.out.println(date1);
    }

    @Test
    public void dateExer1() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);

        System.out.println("********");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);


        Date date1 = sdf.parse(format);
        System.out.println(date1);
        Date date2 = sdf1.parse(format1);
        System.out.println(date2);


    }


}
