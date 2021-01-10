package ScoreExpection;

import java.util.Scanner;

public class teacher {
    public void checkScore(int score) throws ScoreException
    {
        if(score<0||score>100){
            throw new ScoreException("分数越界");
        }
        else{
            System.out.println("true");
        }
    }
}
