package Date.date1;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d1=new Date();
        System.out.println(d1);

        long l=1000*60*60;
        Date d2=new Date(l);
        System.out.println(d2);

        System.out.println(d1.getTime());
        long ll=157198354;

        d2.setTime(ll);
        System.out.println(d2);

    }
}