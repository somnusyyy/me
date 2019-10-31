package Collection;

import java.util.*;

public class ShufflePokers2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        ArrayList<Integer> array=new ArrayList<>();

        String colors[]={"♠","♥","♦","♣"};
        String nums[]={"A","2","3","4","5","6","7","8","9","10","j","Q","K"};

        int index=0;
        for(String color:colors){
            for(String num:nums){
                array.add(index);
                hm.put(index++,color+num);
            }
        }

        array.add(index);
        hm.put(index++,"小王");
        array.add(index);
        hm.put(index,"大王");

//        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
//
//        //遍历方式1
//        Set<Integer> keySet = hm.keySet();
//        for(Integer s:keySet){
//            String value = hm.get(s);
//            System.out.println(s+" "+value);
//        }

        Collections.shuffle(array);



        TreeSet<Integer> player1=new TreeSet<>();
        TreeSet<Integer> player2=new TreeSet<>();
        TreeSet<Integer> player3=new TreeSet<>();
        TreeSet<Integer>  remain=new TreeSet<>();

        for(int i=0;i<array.size();i++){
            Integer poker=array.get(i);
            if(i>=array.size()-3){
                remain.add(poker);
            }
            else if(i%3==0){
                player1.add(poker);
            }
            else if(i%3==1){
                player2.add(poker);
            }
            else if (i%3==2){
                player3.add(poker);
            }
        }

        lookPokers("player1",player1,hm);
        lookPokers("player2",player2,hm);
        lookPokers("player3",player3,hm);
        lookPokers("remain",remain,hm);


    }

    public static void lookPokers(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.print(name+":");
        for(Integer key:ts){
            String value = hm.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }

}
