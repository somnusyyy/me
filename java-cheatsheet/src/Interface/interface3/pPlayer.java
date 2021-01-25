package Interface.interface3;

public class pPlayer extends Player implements English{
    @Override
    public void eat() {
        System.out.println("ping-pong player eat dinner");
        super.eat();
    }

    @Override
    public void learn() {
        System.out.println("learn ping-pong");
    }

    @Override
    public void english() {
        System.out.println("ping-pong players speck English");
    }
}
