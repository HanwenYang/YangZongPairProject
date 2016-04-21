
public class Inventory
{
	private int[] eggCounts = {1,1,0,0,0,0,0};
	private double chickenFeed = 100;
	private Player p;
	
	Inventory()
	{
		double chance = Math.random();
		double cumilative = 0;
		boolean eggFound = false;
		double[] hatchProbability = {0.25, 0.25, 0.205, 0.205, 0.03, 0.03, 0.03};
		
		for(int i = 0; i < hatchProbability.length && !eggFound; i++) {
			cumilative += hatchProbability[i];
			if (chance <= cumilative) {
				eggCounts[i] += 1;
				eggFound = true;
			}	
		}
	}
	public void setPlayer(Player p)
	{
		this.p = p;
	}
	public void addEgg(int type)
	{
		eggCounts[type] += 1;
	}
	public void removeEgg(int type, int num)
	{
		eggCounts[type] -= num;
	}
	public double getFood()
	{
		return chickenFeed;
	}
	public void deductFood(double amt)
	{
		chickenFeed -= amt;
	}
	public int refillPrice()
	{
		return (int)((100 - chickenFeed)*0.05);
	}
	public void refillFood()//to be called after food price has been deducted
	{
		chickenFeed = 100;
	}
	public int totalEggs()
	{
		int sum = 0;
		for (int i = 0; i < eggCounts.length; i++)
			sum += eggCounts[i];
		return sum;
	}
	public int[] getEggCounts()
	{
		return eggCounts;
	}
	public boolean enoughEggs(int price)
	{
		boolean enough = false;
		if (totalEggs() > price)
			enough = true;
		return enough;
	}
}
