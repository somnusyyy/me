package com.itheima;

public class newphone extends phone {
    @Override
    public void call(String name) {
        System.out.println("开启视频功能");
        super.call(name);
    }

    public void text(String name){
        System.out.println("发送信息");
    }
}
