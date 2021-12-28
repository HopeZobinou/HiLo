/**
 *                     HiLo
 *Hope Zobinou
 *
 *This program lets the user play a game of HiLo were the user guesses a number
 *and the computer will determine if the guess was right or not, if the number
 *is above the right answer the computer will reply with too high and if the 
 *number was below the right answer the computer will reply with too low.
 */
import java.util.Random;
import java.util.Scanner;

public class HiLo_HZ 
{
	public static void main(String[] args) 
	{
		int UserNumber;
		int CPUNumber;
		boolean StartGame = true;
		int Tries;
		String stop = "yes";
		Random generator = new Random();
		Scanner kb = new Scanner(System.in);
		Scanner kb1 = new Scanner(System.in);
		do 
		{
			CPUNumber = generator.nextInt(100) + 1;
			System.out.println("Im thinking of a number between 1-100, pick a number.");
			System.out.println("Click 0 to restart");
			UserNumber = kb.nextInt();
			Tries=0;
			while (UserNumber != CPUNumber && UserNumber != 0 ) 
			{
				if (UserNumber < CPUNumber) 
				{
					System.out.println("Too Low, try again");
					UserNumber = kb.nextInt();
					Tries++;
				} 
				else if (UserNumber > CPUNumber) 
				{
					System.out.println("Too High, try again");
					UserNumber = kb.nextInt();
					Tries++;
				}
					
			}
			if (UserNumber == CPUNumber) 
			{
				Tries++;
				System.out.println("Congratulations you guessed the right number");
				System.out.println("You had " + Tries + " Tries");
				System.out.println("If you want to play again type yes");
				System.out.println("If you dont want to play again type no");
				stop = kb1.nextLine();
			}
			if (UserNumber == 0)
			{
				System.out.println("You have ended the game.");
				System.out.println("Type yes if you want to play again");
				System.out.println("Type no if you dont want to play again");
				stop = kb1.nextLine();
			}
		} while (stop.equals("yes"));
			       
	}
}
