package Inner.InnerandOuter;
/*
局部内部类
 */

public class Outer {
    public int num=20;

    public void method(){
        class Inner{
            public void show(){
                System.out.println(num);
            }
        }
        Inner i=new Inner();
        i.show();
    }
}
