package Chapter2;

public class B extends A 
{
	int x;
	
	public B(int x, int xofA)
	{
		super(xofA);
		this.x=x;
	}
	
	public void setxOfA(int x)
	{
		super.setx(x);
	}
	
}
