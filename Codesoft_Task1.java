//Number Game

package codesoft_Tasks;

import java.util.Random;
import java.util.Scanner;
public class Codesoft_Task1 
{
    public static void main(String[] args)
    {
      Random num=new Random();//Random is a class
      int Rnum=num.nextInt(100);
      System.out.println("Random number between 1 and 100: "+Rnum);
      
      //using Scanner class for taking input from user
      Scanner r=new Scanner(System.in);
   
      System.out.println("enter no:of attempts");
      int attempt=r.nextInt();
      
      int i,count=1;
      for( i=0;i<attempt;i++)
      {
          
          System.out.println("enter the guess number");
          int guessno=r.nextInt();
          if(guessno==Rnum)
          {
              System.out.println("congrates,guess number is correct");
              System.out.println("Guess number="+guessno+" Random number="+Rnum);
              System.out.println("Attempts to guess correct number="+count);
              break;
          }
          else if(guessno>Rnum)
          {
              System.out.println("Guess number is too high");
          }
          else if(guessno<Rnum)
          {
              System.out.println("Guess number is too low");
          }
          if(count==attempt)
          System.out.println("All attempts are over.....Please try again!!!");
          count++;
       }
      
     
    }
    
}
