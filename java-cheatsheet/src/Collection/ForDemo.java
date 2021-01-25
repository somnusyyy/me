package Collection;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }

        List<String> list=new ArrayList<String>();
        list.add("java");
        list.add("hello");
        list.add("world");
        for(String s:list){
            System.out.println(s);
        }
    }
}
