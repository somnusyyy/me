package com.itheima;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.eat();
        a.sleep();

        Animal s=new Dog();
        s.eat();

        Cat c=(Cat)a;
        c.play();
        c.sleep();

    }
}
