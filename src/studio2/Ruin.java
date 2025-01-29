package studio2;
import java.util.Random;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int startAmount = 100;
		int current = startAmount;
		double winChance = 50;
		double winLimit = 500;
		int wins = 0;
		int losses = 0;
		
		while (current > 0 || current < winLimit)
		{
			int playRandom = rand.nextInt(101);
			
			if (winChance > playRandom)
			{
				current = current + 10;
				System.out.println("HIT");
				wins++;
			}
			else
			{
				current = current - 10;
				System.out.println("MISS");
				losses++;
			}
			

		}
		
		System.out.print("finished");

	}

}
