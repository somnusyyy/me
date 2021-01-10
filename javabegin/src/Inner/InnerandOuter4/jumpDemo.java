package Inner.InnerandOuter4;

/*
用匿名用户类减少创建对象的操作

 */

public class jumpDemo {
    public static void main(String[] args) {
        jumpOpreat jo = new jumpOpreat();
        jo.method(new jumpping() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");
            }
        });
    }
}
