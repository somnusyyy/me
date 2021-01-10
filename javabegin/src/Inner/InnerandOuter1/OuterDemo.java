package Inner.InnerandOuter1;

public class OuterDemo {
    public static void main(String[] args) {
//        Outer.Inner oi=new Outer().new Inner();
//        oi.show();

        Outer o=new Outer();    //借助外部来进行访问
        o.method();
    }
}
