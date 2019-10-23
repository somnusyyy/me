package com.itheima;

public class Cat extends Animal {
    @Override
    public void eat() {
//        super.eat();
        System.out.println("猫在吃饭");
    }

    public void play(){
        System.out.println("猫在玩");
    }
}
