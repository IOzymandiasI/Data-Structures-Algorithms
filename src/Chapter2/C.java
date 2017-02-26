package Chapter2;

public class C extends B 
{
	int x;
	
	public C(int x, int xOfB,int xOfA)
	{
		super(xOfB,xOfA);
		this.x=x;
	}
	
	public void setxOfA(int x)
	{
		super.setxOfA(x);
	}
	
}
