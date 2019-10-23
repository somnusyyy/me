package interface1;

public class Cat extends Animal implements jumpping {
    @Override
    public void jump() {
        System.out.println("猫在跳");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
