import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PenPanel extends JPanel{
	Pen p;
	JPanel pen;
	JPanel[] tiles=new JPanel[16];
	
	PenPanel(Pen P){
		p=P;
		pen=new JPanel();
		pen.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
		pen.setBackground(new Color(51,181,74));
		pen.setLayout(new GridLayout(16,16,5,5));	
	}
	
	public void drawChickens(ArrayList<Chicken> chickens){
		for(int i=0;i < chickens.size();i++){
			tiles[i]=new JPanel();
			Image background = Toolkit.getDefaultToolkit().createImage(chickens.get(i).getImage());
		    tiles[i].drawImage(background, 0, 0, null);
			tiles[i].setAlignmentX(JLabel.CENTER_ALIGNMENT);
			tiles[i].setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
			pen.add(tiles[i]);
		}
	}

}
