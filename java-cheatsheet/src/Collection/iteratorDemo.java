package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iteratorDemo {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("hello");
        c.add("world");

        Iterator it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
