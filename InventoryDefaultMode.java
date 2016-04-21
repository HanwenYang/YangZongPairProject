import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class InventoryDefaultMode extends JPanel implements ActionListener
{
	Inventory I;
	int maxEggs;
	EggPanel[] eggDisplay;
	
	InventoryDefaultMode(Inventory I)
	{
		this.I = I;
		
		int displayNum = 0;
		for (int i = 0; i < this.I.getEggCounts().length; i++)
			if (this.I.getEggCounts()[i] != 0)
				displayNum += 1;
		eggDisplay = new EggPanel[displayNum];
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
	class EggPanel extends JPanel implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
		}
		public void paintComponent(Graphics g)
		{
			
		}
	}
	class HatchPopup extends JFrame implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
		}
	}
	class FoodPopup extends JFrame implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
		}
	}
}
