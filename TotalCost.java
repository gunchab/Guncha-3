/*
 * This is a class that has a method to calculate the total cost of an item.
 */
public class TotalCost {
	
	private final String NECESSORY = "Necessary";
	private final String lUXURY = "Luxury";
	/*
	 * This method takes the amount of the item and the item type and returns the final cost.
	 */
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
