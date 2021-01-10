package Integer;

public class IntegerDemo {
    public static void main(String[] args) {

        Integer i1=new Integer(12);//根据int值创建对象
        System.out.println(i1);

        Integer i2=new Integer("123");//根据String值创建int对象
        System.out.println(i2);
        //已过时

//        Integer i3=valueof();
//        i3.valueOf(100);
//        System.out.println(i3);
//        Integer i4=new Integer();
//        i4.valueof("123");

        //int--->String
        int num=100;
        //method 1
        String s1=""+num;
        System.out.println(s1);

        //method 2
        String s2=String.valueOf(num);
        System.out.println(s2);

        //String--->int
        String s="200";
        //method 1
        Integer i=new Integer(s);
        int x=i.intValue();
        System.out.println(x);

        //method 2
        int y=Integer.parseInt(s);
        System.out.println(y);

    }
}
