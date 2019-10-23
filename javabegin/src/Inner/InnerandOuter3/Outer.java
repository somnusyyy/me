package Inner.InnerandOuter3;

/*
匿名内部类
 */

public class Outer {

    public void method(){
    /*
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };//此处相当于调用了一个子类

     */
        Inter i=new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };//此处相当于调用了一个子类的方法
        i.show();

    }
}
