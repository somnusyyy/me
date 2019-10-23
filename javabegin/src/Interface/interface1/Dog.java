package Interface.interface1;

public  class Dog extends Animal implements jumpping {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("狗在跳");
    }
}
