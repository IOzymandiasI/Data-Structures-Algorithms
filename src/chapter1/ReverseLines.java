package chapter1;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReverseLines 
{

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException 
	{
//		Scanner input = new Scanner(System.in);
		Scanner input = new Scanner(new FileReader("/Java/Data Structure & Algorithms/testfiles/reverseLines.txt"));
		reverseLines(input);
		input.close();
	}
	
	/**
	 * @param input
	 */
	public static void reverseLines(Scanner input)
	{
		StringBuilder sb = new StringBuilder("");
		while (input.hasNextLine())
		{
			sb.append(input.nextLine());
			sb.reverse();
			System.out.println(sb.toString());
			sb.delete(0,sb.capacity());
		}
	}

}
