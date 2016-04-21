
public class Game
{
	private HumanPlayer H;
	private ComputerPlayer C;
	private int maxEggs;
	
	Game(HumanPlayer H, ComputerPlayer C, int maxEggs)
	{
		this.H = H;
		this.C = C;
		this.maxEggs = maxEggs;
	}
	public void playGame()
	{
		
	}
	public HumanPlayer getHumanPlayer()
	{
		return H;
	}
	public ComputerPlayer getcomputerPlayer()
	{
		return C;
	}
	public static void main(String[] args)
	{
		
	}
}