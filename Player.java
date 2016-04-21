
public abstract class Player
{
	protected Inventory I;
	protected Pen P;
	
	Player(Inventory I, Pen P)
	{
		this.I = I;
		this.P = P;
	}
	public Inventory getInventory()
	{
		return I;
	}
	public Pen getPen()
	{
		return P;
	}
	public abstract void doStuff();
}
