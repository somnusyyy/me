package com.itheima;

public class phoneDemo {
    public static void main(String[] args) {
        phone p=new newphone();
        p.call("123");

//        newphone s=new newphone();
//        s.text("13");
        newphone np=(newphone)p;
        np.text("12");
    }
}
