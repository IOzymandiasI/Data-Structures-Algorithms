package chapter1;

import java.util.Random;

public class BirthdayParadox {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int numberOfPeople = 23;
		birthdayParadox(numberOfPeople);
	}
	
	/**
	 * @param numberOfPeople
	 */
	public static void birthdayParadox(int numberOfPeople) 
	{
		int numberOfTrials = 5000000, count = 0;
		Random[] randomArray = new Random[numberOfTrials];
		for(int i = 0; i < numberOfTrials; i++)
		{
			randomArray[i] = new Random(i);
		}
		int[] randomBirthdays = new int[numberOfPeople];
	
		for(int i = 0; i < numberOfTrials; i++)
		{
			for (int j = 0; j < numberOfPeople; j++)
			{
				randomBirthdays[j] = randomArray[i].nextInt(365)+1;
			}	
			if (uniqueBirthday(randomBirthdays)) count++;
		}
		
		System.out.println(100-uniquenessPercentage(numberOfTrials, count));
	}
	
	/**
	 * @param birthdays
	 */
	private static boolean uniqueBirthday(int[] birthdays)
	{
		int length = birthdays.length;
		for (int i = 0; i < length-1; i++)
		{
			for (int j = i+1; j < length; j++)
			{
				if (birthdays[i] == birthdays[j]) return false;
			}
		}
		return true;
	}

	/**
	 * @param noOfTrials
	 * @param count
	 */
	private static double uniquenessPercentage(int noOfTrials, int count)
	{
		return (double)count/noOfTrials*100; 
	}
}
