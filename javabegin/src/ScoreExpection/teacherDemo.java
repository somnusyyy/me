package ScoreExpection;

import java.util.Scanner;

public class teacherDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        teacher t=new teacher();
        try{
            t.checkScore(score);
        }catch (ScoreException s){
            s.printStackTrace();
        }


    }
}
