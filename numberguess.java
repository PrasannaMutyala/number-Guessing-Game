import java.util.Scanner;
import java.util.Random;
public class numberguess {
    public static void main(String args[])
    {
        Scanner reader=new Scanner(System.in);
        String play="yes";
        while(play.equals("yes"))
        {
            Random rand=new Random();
            int randnum=rand.nextInt(100);
            int guess=-1;
            int atempts=0;
            System.out.println("Guess a number between 1 and 100: ");
            while(guess!=randnum)
            {
                //System.out.println("Guess a number between 1 and 100: ");
                guess=reader.nextInt();
                atempts++;
                if(guess==randnum)
                {
                    System.out.println("wonderful ypu guessed the correct number");
                    System.out.println("you took "+atempts+" guesses");
                    System.out.println("would you like to play again ? Yes or no:");
                    play=reader.next().toLowerCase();
                }
                else if(guess>randnum)
                {
                    System.out.println("Your guess to high,try again");
                }
                else
                {
                    System.out.println("your guess is to low,try again");
                }
            }
        }
        reader.close();
    }
    
}
