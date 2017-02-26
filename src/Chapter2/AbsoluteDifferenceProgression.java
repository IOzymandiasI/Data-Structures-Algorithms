package Chapter2;

public class AbsoluteDifferenceProgression extends Progression 
{
	protected long prev;
	
	public AbsoluteDifferenceProgression(){ this(2,200);}
	
	public AbsoluteDifferenceProgression(long first, long second)
	{
		super(first);
		prev = second + first;
	}

	protected void advance()
	{
		long temp = prev;
		prev = current;
		if (current - temp < 0)
			current = (current - temp)*-1;
		else
			current = current- temp;
//		prev = current + 
//		prev = current + prev;
//		current = current - prev;
//		prev = current + prev;
//		current = current *-1;
//		current = current - prev;
	}
	
	
}
