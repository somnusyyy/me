package Interface.interface2;

public class InterImpl extends Object implements Inter {
    public InterImpl(){
        super();//object内的构造方法
    }

    @Override
    public void method() {
        System.out.println("method");
    }
}
