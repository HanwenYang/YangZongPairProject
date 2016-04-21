import java.util.ArrayList;

public class ComputerPlayer extends Player
{
	ComputerPlayer(Inventory I, Pen P)
	{
		super(I, P);
	}
	public void doStuff()
	{
		collectEggs();
		upgradePen();
		hatchEggs();
		refillFood();
	}
	public void collectEggs()
	{
		ArrayList<Chicken> penChickens = this.P.getChickens();
		for (int i = 0; i < penChickens.size(); i++)
		{
			if (penChickens.get(i).hasEgg())
				I.addEgg(penChickens.get(i).collectEgg());
		}
	}
	public void upgradePen()
	{
		
	}
	public void hatchEggs()
	{
		
	}
	public void refillFood()
	{
		
	}
}
