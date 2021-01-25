package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        list.add(1,"javaee");
        list.remove(1);
        list.set(2,"jdk");//修改指定位置元素
        System.out.println(list.get(0));//get方法返回的是元素

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
