/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17bce7066;

/**
 *
 * @author User
 */
public class CricketScorer 
{
    private int score;
    public CricketScorer()
    {
        score=0;
    }
    public void four()
    {
        score+=4;
    }
    public void six()
    {
        score=score+6;
    }
    public int getScore()
    {
        return score;
    }
    public static void main(String[] args) 
    {
        CricketScorer obj=new CricketScorer();
        obj.four();
        obj.six();
        int s=obj.getScore();
        System.out.println("Score: "+s);
    }
}
