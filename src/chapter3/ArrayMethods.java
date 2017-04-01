package chapter3;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Date;

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
		int length = 2;
		Integer intArray[] = new Integer[length];
		Random ran = new Random();
		for (int i = 0; i < length; i++)
		{
			intArray[i] = ran.nextInt(100);
			System.out.print(intArray[i].toString() + ", ");
		}
				
		System.out.println();
		shuffle(intArray);
		
		for (int i = 0; i < length; i++)
		{
			System.out.print(intArray[i].toString() + ", ");
		}
		
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
	
	private static <A> A[] backup(A[] original)
	{
		int length = original.length;
		A[] backup = (A[]) new Object[length];
		for (int i = 0; i < length; i++)
		{
			backup[i]=original[i];
		}
		return backup;
	}
	
	public static <A> void shuffle(A[] array)
	{
		int length = array.length;
		int a;
		
		A intermediate = (A) new Object();
		Random num = new Random(length);
		
//		for (int i=0; i< 100; i++)
//		{
//			a = (num.nextInt(length));
//			System.out.println(a);
//		}
	
		for (int i=0; i< length; i++)
		{
			intermediate = array[i];
			a = (num.nextInt(length));
//			System.out.println(a);
			array[i] = array[a];
			array[a] = intermediate;
		}
		
	}
}
