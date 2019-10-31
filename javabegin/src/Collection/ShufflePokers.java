package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ShufflePokers {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<String>();

        String colors[]={"♠","♥","♦","♣"};
        String nums[]={"A","2","3","4","5","6","7","8","9","10","j","Q","K"};

        for(String color:colors){
            for(String num:nums){
                array.add(color+num);
            }
        }
        array.add("小王");
        array.add("大王");

        Collections.shuffle(array);

        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String>  remain=new ArrayList<>();

        for(int i=0;i<array.size();i++){
            String poker=array.get(i);
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

        System.out.println("player1"+player1);
        System.out.println("player2"+player2);
        System.out.println("player3"+player3);
        System.out.println("remains"+remain);

    }
}
