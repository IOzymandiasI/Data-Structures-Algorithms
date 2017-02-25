public class Flower 
{
	private String name;
	private int noOfPetals;
	private float price;
	
	public Flower(String name,int noOfPetals, float price)
	{
		this.name = name;
		this.noOfPetals = noOfPetals;
		this.price = price;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setNoOfPetals(int noOfPetals)
	{
		this.noOfPetals = noOfPetals;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}

	public String getName()
	{
		return this.name;
	}
	
	public int getNoOfPetals()
	{
		return this.noOfPetals;
	}
	
	public float getPrice()
	{
		return this.price;
	}
	

}
