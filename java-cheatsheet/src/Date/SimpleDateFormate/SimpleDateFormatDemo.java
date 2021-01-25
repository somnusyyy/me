package Date.SimpleDateFormate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String s=sdf.format(d);
        System.out.println(s);

        String s2="20191025143421" ;
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = sdf2.parse(s2);
        System.out.println(date);


    }
}
