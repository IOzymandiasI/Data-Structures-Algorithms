import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuilder;

public class Chapter1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{	
		
//		UNIT TEST R-1.2
//		System.out.print("Enter an integer n. \n");
//		Scanner input = new Scanner(System.in); 
//		long n,m;
//		while (!input.hasNextLong())
//		{	
//			System.out.print("The value was not an integer. Please try again. \n");
//			input.next();
//		} 
//		n = input.nextLong();
//		
//		System.out.print("Enter another integer m that is not equal to 0. \n");
//		input= new Scanner(System.in);
//		int count = 0;
//		m=0;
//		while (count!=2)
//		{
//			count = 0;
//			if (!input.hasNextLong())
//			{	
//				System.out.print("The input value was not an integer. Please try again. \n");
//				input.next();
//				continue;
//			} 
//			else count++;
//			m = input.nextLong();
//			if (m==0)
//			{
//				continue;
//			}
//			else break;
//		}
//
//		input.close();
//		if(isMultiple(n,m))
//		{
//			System.out.print("n is divisible by m. \n");
//		}
//		else System.out.print("n is not divisible by m. \n");
		
		
//		UNIT TEST R-1.3
//		System.out.print("Enter an integer i. \n");
//		Scanner input = new Scanner(System.in); 
//		int i;
//		while (!input.hasNextInt())
//		{	
//			System.out.print("The value was not an integer. Please try again. \n");
//			input.next();
//		} 
//		i = input.nextInt();
//		
//		input.close();
//		if(isOdd(i))
//		{
//			System.out.print("i is odd. \n");
//		}
//		else System.out.print("i is even. \n");
//	
//		
		
////		UNIT TEST R-1.4
//		System.out.print("Enter an integer n. \n");
//		Scanner input = new Scanner(System.in); 
//		int n;
//		while (!input.hasNextInt())
//		{	
//			System.out.print("The value was not an integer. Please try again. \n");
//			input.next();
//		} 
//		n = input.nextInt();
//		
//		input.close();
//		System.out.printf("The sum of all positive integers up to and" +
//		" including %d is %d.",n,sumToInteger(n));
//	}
//	
		
		
////		UNIT TEST R-1.5
//		System.out.print("Enter an integer n. \n");
//		Scanner input = new Scanner(System.in); 
//		int n;
//		while (!input.hasNextInt())
//		{	
//			System.out.print("The value was not an integer. Please try again. \n");
//			input.next();
//		} 
//		n = input.nextInt();
//		
//		input.close();
//		System.out.printf("The sum of all even positive integers up to and" +
//		" including %d is %d.",n,sumOfEvens(n));
//	}
//	
////	UNIT TEST R-1.6
//	System.out.print("Enter an integer n. \n");
//	Scanner input = new Scanner(System.in); 
//	int n;
//	while (!input.hasNextInt())
//	{	
//		System.out.print("The value was not an integer. Please try again. \n");
//		input.next();
//	} 
//	n = input.nextInt();
//	
//	input.close();
//	System.out.printf("The sum of all squares up to and" +
//	" including %d is %d.",n,sumOfSquares(n));
//}

////	UNIT TEST R-1.7
//	System.out.print("Enter a string of characters. \n");
//	Scanner input = new Scanner(System.in); 
//	String s;
//	s = input.nextLine();
//	
//	input.close();
//	System.out.printf("The number of vowels in the string" 
//	+ " is %d.", vowelCount(s));
//}

////		UNIT TEST R-1.8
//		System.out.print("Enter a string of characters. \n");
//		Scanner input = new Scanner(System.in); 
//		String s;
//		s = input.nextLine();
//		
//		input.close();
//		
//		System.out.print(removePunctuation(s));
//	}
//	
		
//		UNIT TEST R-1.8
		System.out.print("Enter a string of characters. \n");
		Scanner input = new Scanner(System.in); 
		String s;
		s = input.nextLine();
		
		input.close();
		
		System.out.print(removePunctuation(s));
	}
	
	///Summary
	///Question R-1.1
	///Summary
	/**
	 * Question R-1.1:
	 * Suppose that we create array A if GameEntry objects, which has an integer 
	 * scores field, and we clone A and store the result in an array B. If we 
	 * immediately set A[4] score equal to 550, what is the score value of the 
	 * GameEntry object referenced by B[4]?
	 *
	 * My Answer:
	 * The value of B4 will be equal to the original A[4] value, not 550.
	 * This is because A and B reference different arrays from the heap.
	 */
	
	///Summary
	///Question R-1.2
	///Summary
	/**
	 * Question R-1.2:
	 * Write a short Java method, isMultiple, that takes two long values, n
	 * and m, and returns true if and only if n is a multiple of m, that is, 
	 * n=mi for some integer i.
	 *
	 * My Solution:
	 * Hm, off the top of my head there is no better way to solve this than to
	 * simple use the modulus operator. I think that this method should also
	 * be static since it makes no sense to have to initialize a variable to
	 * use it.
	 */
	public static boolean isMultiple(long n,long m)
	{
		if (n%m==0) return true;
		else return false;
	}
	
	///Summary
	///Question R-1.3
	///Summary
	/**
	 * Question R-1.3:
	 * Write a short Java method, isOdd, that takes an int i and returns 
	 * true if and only if i is odd. Your method cannot use the 
	 * multiplication, modulus, or division, operators, however.
	 * 
	 * My Solution:
	 * There are a number of ways to do this and I went for the one that
	 * came to me the quickest, which involves converting the int to 
	 * either a binary string or string and using the last character to
	 * determine if the number is odd or not. If we use a binary string,
	 * which has been done in my solution, the last character will always
	 * be 1 for an odd number, but if it is just a regular decimal string,
	 * the character can be 1,3,5,7,or 9.
	 */
	public static boolean isOdd(int i)
	{
		String s = Integer.toBinaryString(i);
		if (Character.getNumericValue(s.charAt(s.length()-1))==1)
		{
			return true;
		}
		else return false;
	}
	
	
	///Summary
	///Question R-1.4
	///Summary
	/**
	 * Question R-1.4:
	 * Write a short Java method that takes an integer n and returns 
	 * the sum off all positive integers less than or equal to n.
	 * 
	 * My Solution:
	 * This can be done with pretty much any loop or recursive function, 
	 * but I think I'll stick with the tried and trusted for loop :).
	 */
	public static long sumToInteger(int n)
	{
		if (n<1) return 0;
		long sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	///Summary
	///Question R-1.5
	///Summary
	/**
	 * Question R-1.5:
	 * Write a short Java method that takes an integer n and returns 
	 * the sum off all the even positive integers less than or equal to n.
	 * 
	 * My Solution:
	 * This is similar to question 5, with the only difference being 
	 * the loop increments are +2 and the loops initial value.
	 */
	public static long sumOfEvens(int n)
	{
		if (n<1) return 0;
		long sum=0;
		for(int i=0;i<=n;i=i+2)
		{
			sum+=i;
		}
		return sum;
	}
	
	///Summary
	///Question R-1.6
	///Summary
	/**
	 * Question R-1.6:
	 * Write a short Java method that takes an integer n and returns 
	 * the sum off all the squares of positive integers less than or
	 * equal to n.
	 * 
	 * My Solution:
	 * This is similar to question 5, but now we are simply adding
	 * i*i rather than i.
	 */
	public static long sumOfSquares(int n)
	{
		if (n<1) return 0;
		long sum=0;
		for(int i=0;i<=n;i++)
		{
			sum+=i*i;
		}
		return sum;
	}
	
	///Summary
	///Question R-1.7
	///Summary
	/**
	 * Question R-1.7:
	 * Write a short Java method that counts the number of vowels 
	 * in a given character string.
	 * 
	 * My Solution:
	 * There are probably better ways to do this one, but I just
	 * decided to make the string lower case and compare each letter
	 * to each vowel.
	 */
	public static int vowelCount(String s)
	{
		int vowelCount=0;
		s.toLowerCase();
		for(char c: s.toCharArray())
		{
			if (c=="e".charAt(0) || c=="a".charAt(0) ||
			c=="o".charAt(0) || c=="i".charAt(0) || c=="u".charAt(0))
			{
				vowelCount++;
			}
		}
		return vowelCount;
	}
	
	
	///Summary
	///Question R-1.8
	///Summary
	/**
	 * Question R-1.8:
	 * Write a short Java method that uses a StringBuilder instance to
	 * remove all the punctuation from a string s storing a sentence,
	 * for example transforming the string "Let's try, Mike!" to "Lets
	 * try Mike".
	 * 
	 * My Solution:
	 * There may be better ways of doing this, but I just compared each 
	 * character in the string to common punctuation, and if there was 
	 * a match, I added it to the string builder; if not, it was ignored.
	 */
	public static String removePunctuation(String s)
	{
		StringBuilder sb = new StringBuilder();
		for(char c: s.toCharArray())
		{
			if (c=="!".charAt(0) || c==";".charAt(0) ||
			c==":".charAt(0) || c=="'".charAt(0) || c==".".charAt(0)
			|| c==",".charAt(0) || c=="?".charAt(0) || c=="\"".charAt(0)
			|| c=="(".charAt(0) || c==")".charAt(0) || c=="-".charAt(0))
			{
				continue;
			}
			else sb.insert(sb.length(), c);
		}
		return sb.toString();
	}
	
	///Summary
		///Question R-1.9
		///Summary
		/**
		 * For question 9, go to the flower class.
		 */
}
