package practice;
 import java.util.Scanner;

    	 public class FlipCoin {

    	 	static void flipPerc(int time)
    	 	{
    	 		double heads = 0;
    	 		for (int i = 0; i < time; i++) 
    	 		{
    	 			if (Math.random() > 0.5)
    	 			{
    	 				heads++;
    	 			}
    	 		}
    	 		System.out.println("heads percentage is " + (float) (heads / time) * 100);
    	 		System.out.println("tails percentage is " + (float) (time - heads) / time * 100);
    	 	}

    	 	public static void main(String[] args) 
    	 	{
    	 		Scanner s = new Scanner(System.in);
    	 		System.out.println("enter number of times  a coin is flipped");
    	 		int time = s.nextInt();
    	 		flipPerc(time);
    	 		s.close();
    	 	}
    	 }






