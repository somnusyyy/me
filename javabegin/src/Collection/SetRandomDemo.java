package Collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetRandomDemo {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<Integer>();
        Random r=new Random();
        while ((set.size() <10)){
            int nextInt = r.nextInt(20);
            set.add(nextInt);
        }
        for(int i:set){
            System.out.println(i);
        }
    }
}
