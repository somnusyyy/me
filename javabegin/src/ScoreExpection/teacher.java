package ScoreExpection;

import java.util.Scanner;

public class teacher {
    public void checkScore(int score) throws ScoreException
    {
        if(score<0||score>100){
            throw new ScoreException();
        }
        else{
            System.out.println("true");
        }
    }
}
