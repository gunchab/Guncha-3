
public class TotalCost {
	
	final String NECESSORY = "Necessary";
	final String lUXURY = "Luxury";
	public int totalCostCalculator(int amount,String type)
	{
		int total= 0;
		if(type.equalsIgnoreCase(NECESSORY) )
		{
			total =  amount + amount/100;
			return total;
		}
		else if(type.equalsIgnoreCase(lUXURY))
		{
			total =  amount + (amount*9)/100;
			return total;
		}
		else
		{
			System.out.println("Enter a valid type");
			return total;
		}
	}
	

}
