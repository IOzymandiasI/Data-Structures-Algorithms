package Chapter2;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{	
//		FibonacciProgression fp = new FibonacciProgression(2,2);
//		int n=10;
//		for (int i=1; i<n; i++)
//		{
//			fp.advance();
//		}
//		System.out.printf("The %dth value of the series is %d",n, fp.current);
		
		AbsoluteDifferenceProgression adp = new AbsoluteDifferenceProgression(2,200);
		int n=10;
		for (int i=1; i<n; i++)
		{
			System.out.printf("The value of the series is %d \n", adp.current);
			adp.advance();
		}
		System.out.printf("The %dth value of the series is %d",n, adp.current);
		
//		try
//		{
//			int[] array= {1,2,3,4,5,6,7,8,9,10};
//			System.out.println("Input a value n to return the nth value of an array that has 10 entries.");
//			Scanner in = new Scanner(System.in);
//			int n = in.nextInt();
//			in.close();
//			System.out.printf("The value at entry n is %d", array[n]);
//		}
//		catch (IndexOutOfBoundsException e)
//		{
//			System.out.println("Don't try buffer overflow attacks in Java!");
//		}

	}

}
