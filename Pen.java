import java.util.ArrayList;

public class Pen
{
	private int size = 4; //capacity of the pen
	private ArrayList <Chicken> chickens; //the actual chickens in the pen
	private Player p;

	public void setPlayer(Player p)
	{
		this.p=p;
	}
	public Player getPlayer()
	{
		return p;
	}
	public int getSize()
	{
		return size;
	}
	public void addChicken(Chicken c) //precondition that pen has enough space
	{
		chickens.add(c);
	}
	public ArrayList<Chicken> getChickens()
	{
		return chickens;
	}
	public int getUpgradedPrice()
	{
		int upgradePrice = 0; //price = change in size + 2^number of upgrade
		if (size == 4)
			upgradePrice = 4+1;
		if (size == 6)
			upgradePrice = 6+2;
		if (size == 9)
			upgradePrice = 6+4;
		if (size == 12)
			upgradePrice = 8+8;
		return upgradePrice;
	}
	public void upgradePen() //called after eggs have already been deducted
	{
		if (size == 4)
			size = 6;
		else if (size == 6)
			size = 9;
		else if (size == 9)
			size = 12;
		else if (size == 12)
			size = 16;
	}
}
