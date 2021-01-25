package Date.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils(){}
    public static String DateToString(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMDDHHmmss");
        String s=sdf.format(date);
        return s;
    }

    public static Date StringToDate(String s) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMDDHHmmss");
        Date date=sdf.parse(s);
        return date;
    }
}
