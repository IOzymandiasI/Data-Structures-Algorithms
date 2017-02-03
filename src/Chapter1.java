import java.util.Scanner;

public class Chapter1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{	
		System.out.print("Enter an integer n. \n");
		Scanner input = new Scanner(System.in); 
		long n,m;
		while (!input.hasNextLong())
		{	
			System.out.print("The value was not an integer. Please try again. \n");
			input.next();
		} 
		n = input.nextLong();
		
		System.out.print("Enter another integer m that is not equal to 0. \n");
		input= new Scanner(System.in);
		int count = 0;
		m=0;
		while (count!=2)
		{
			count = 0;
			if (!input.hasNextLong())
			{	
				System.out.print("The input value was not an integer. Please try again. \n");
				input.next();
				continue;
			} 
			else count++;
			m = input.nextLong();
			if (m==0)
			{
				continue;
			}
			else break;
		}

		input.close();
		if(isMultiple(n,m))
		{
			System.out.print("n is divisible by m. \n");
		}
		else System.out.print("n is not divisible by m. \n");
		
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
	 * Question R-1.1:
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
	
}
