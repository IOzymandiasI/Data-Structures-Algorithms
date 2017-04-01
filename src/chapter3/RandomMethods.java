package chapter3;
import java.util.Random;

public class RandomMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Random r = new Random();
		int x =1;
		
		for (int i = 0; i<100; i++)
		{
			x *= r.nextInt(10);
		}
		
		System.out.println(x);

	}

}
