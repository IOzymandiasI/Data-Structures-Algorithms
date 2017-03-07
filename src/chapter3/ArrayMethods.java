package chapter3;
import java.util.concurrent.ThreadLocalRandom;


//This class is a solution to the problem presented in R-3.1.
public class ArrayMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
//		Integer intArray[] = {1,23,65,43,77,61,43};
//		Character charArray[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M'};

//		Test Cases.
//		randomDelete(intArray, intArray.length);
//		randomDelete(charArray, charArray.length);

//		randomDeleteAll(intArray);
//		randomDeleteAll(charArray);
	}
	
	private static <A> A[] randomDelete(A[] array, int max)
	{
		int entry = ThreadLocalRandom.current().nextInt(max);
		A[] arrayAfterDeletion = (A[]) new Object[max-1];
				
		for (int i = 0; i < entry; i++)
		{
			arrayAfterDeletion[i] = array[i];
			System.out.print(arrayAfterDeletion[i].toString());
			if (i<max-2) System.out.print(", ");
		}
							
		for (int i = entry; i < max-1; i++)
		{
			arrayAfterDeletion[i] = array[i+1];
			System.out.print(arrayAfterDeletion[i].toString());
			if (i<max-2)
			{
				System.out.print(", ");
			}
		}
		System.out.println();
		return arrayAfterDeletion;
	}
	
	private static <A> void randomDeleteAll(A[] array)
	{
		int min = 0;
		int max = array.length;
		while (max>min)
		{
			array = randomDelete(array, max);
			max--;
		}
	}
	
}
