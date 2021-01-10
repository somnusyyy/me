package Collection;

import java.util.LinkedList;

public class LinkedlistDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedlist=new LinkedList<String>();
        linkedlist.add("hello");
        linkedlist.add("world");
        linkedlist.add("java");

        /*
        首尾添加元素
         */
        linkedlist.addFirst("1");
        linkedlist.addLast("999");

        for(String s:linkedlist){
            System.out.println(s);
        }

        /*
        移除栈首栈尾元素
         */
        linkedlist.removeFirst();
        linkedlist.removeLast();

        for(String s:linkedlist){
            System.out.println(s);
        }

        /*
        返回栈首栈尾元素
         */
        System.out.println(linkedlist.getFirst());
        linkedlist.getLast();

    }
}
