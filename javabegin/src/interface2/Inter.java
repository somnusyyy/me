package interface2;

/*
接口没有构造方法
InterImpl中可以调用父类的构造方法（继承object）
 */

public interface Inter {
    public int num=10;
    public final int num2=20;
    //接口中成员变量默认被final修饰

    public abstract void method();//=void method()
}
