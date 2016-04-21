import javax.swing.*;

public class Chicken
{
	public static final int WhiteLeghorn = 0;
	public static final int RIRed = 1;
	public static final int Silkie = 2;
	public static final int Appenzeller = 3;
	public static final int Phoenix = 4;
	public static final int Dino = 5;
	public static final int Terminator = 6;
	
	private int type;
	private String name = "";
	private Pen p;
	
	private double time = 0;
	private boolean mature = false;
	private boolean egg = false;
	private double[] consumption;
	private double maturity;
	private double eggRate;
	private ImageIcon babyChick;
	private ImageIcon Chicken;
	private ImageIcon eggChicken;

	Chicken(int type, Pen p)
	{
		this.type = type;
		this.p = p;
		
		switch (this.type) {
		case WhiteLeghorn:
			createWhiteLeghorn();
			break;
		case RIRed:
			createRIRed();
			break;
		case Silkie:
			createSilkie();
			break;
		case Appenzeller:
			createAppenzeller();
			break;
		case Phoenix:
			createPhoenix();
			break;
		case Dino:
			createDino();
			break;
		case Terminator:
			createTerminator();
			break;
		}
	}
	public String getName()
	{
		return name;
	}
	public ImageIcon getImage()
	{
		ImageIcon picture;
		if (!mature)
			picture = babyChick;
		else if (!hasEgg())
			picture = Chicken;
		else
			picture = eggChicken;
		return picture;	
	}
	public boolean hasEgg()
	{
		return egg;
	}
	public void addTime(double increment) //chicken eats food and grows; call every time interval
	{
		double foodLeft = p.getPlayer().getInventory().getFood();
		
		if (foodLeft >= getConsumption())
		{
			p.getPlayer().getInventory().deductFood(getConsumption());
			
			if (!egg)
				time += increment;
			if (!mature && time >= maturity)
			{
				mature = true;
				time = 0;
			}
			else if (mature && time >= eggRate)
			{
				egg = true;
				time /= eggRate;
			}		
		}
	}
	public int collectEgg() //precondition the chicken must have egg
	{
		egg = false;
		return type;
	}
	private double getConsumption()
	{
		double consumption = 0;
		if (!mature)
			consumption = this.consumption[0];
		else
			consumption = this.consumption[1];
		return consumption;
	}
	private void createWhiteLeghorn()
	{
		name = "White Leghorn";
		double[] tempCon = {};
		consumption = tempCon;
		maturity = 0;
		eggRate = 0;
		babyChick = new ImageIcon();
		Chicken = new ImageIcon();
		eggChicken = new ImageIcon();
	}
	private void createRIRed()
	{
		name = "Rhode Island Red";
		double[] tempCon = {};
		consumption = tempCon;
		maturity = 0;
		eggRate = 0;
		babyChick = new ImageIcon();
		Chicken = new ImageIcon();
		eggChicken = new ImageIcon();
	}
	private void createSilkie()
	{
		name = "Silkie";
		double[] tempCon = {};
		consumption = tempCon;
		maturity = 0;
		eggRate = 0;
		babyChick = new ImageIcon();
		Chicken = new ImageIcon();
		eggChicken = new ImageIcon();
	}
	private void createAppenzeller()
	{
		name = "Appenzeller";
		double[] tempCon = {};
		consumption = tempCon;
		maturity = 0;
		eggRate = 0;
		babyChick = new ImageIcon();
		Chicken = new ImageIcon();
		eggChicken = new ImageIcon();
	}
	private void createPhoenix()
	{
		name = "Phoenix";
		double[] tempCon = {};
		consumption = tempCon;
		maturity = 0;
		eggRate = 0;
		babyChick = new ImageIcon();
		Chicken = new ImageIcon();
		eggChicken = new ImageIcon();
	}
	private void createDino()
	{
		name = "Dino";
		double[] tempCon = {0.2,3};
		consumption = tempCon;
		maturity = 45;
		eggRate = 10;
		babyChick = new ImageIcon();
		Chicken = new ImageIcon();
		eggChicken = new ImageIcon();
	}
	private void createTerminator()
	{
		name = "Terminator";
		double[] tempCon = {5,0};
		consumption = tempCon;
		maturity = 0;
		eggRate = 25;
		babyChick = new ImageIcon();
		Chicken = new ImageIcon();
		eggChicken = new ImageIcon();
	}
}
