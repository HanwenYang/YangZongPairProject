import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Egg
{
	private BufferedImage eggImage;
	private double[] hatchProbability;
	
	Egg(int type)
	{	
		switch (type) {
		case Chicken.WhiteLeghorn:
			createWhiteLeghorn();
			break;
		case Chicken.RIRed:
			createRIRed();
			break;
		case Chicken.Silkie:
			createSilkie();
			break;
		case Chicken.Appenzeller:
			createAppenzeller();
			break;
		case Chicken.Phoenix:
			createPhoenix();
			break;
		case Chicken.Dino:
			createDino();
			break;
		case Chicken.Terminator:
			createTerminator();
			break;
		}
	}
	public int hatch()
	{	
		double chance = Math.random();
		double cumilative = 0;
		boolean chickenFound = false;
		int choice = -1;
		
		for(int i = 0; i < hatchProbability.length && !chickenFound; i++) {
			cumilative += hatchProbability[i];
			if (chance <= cumilative) {
				choice = i;
				chickenFound = true;
			}	
		}
		return choice;
	}
	private void createWhiteLeghorn()
	{
		double[] tempCon = {};
		hatchProbability = tempCon;
		try {
		    eggImage = ImageIO.read(new File(""));
		} catch (IOException e) {
		}
	}
	private void createRIRed()
	{
		double[] tempCon = {};
		hatchProbability = tempCon;
		try {
		    eggImage = ImageIO.read(new File(""));
		} catch (IOException e) {
		}
	}
	private void createSilkie()
	{
		double[] tempCon = {};
		hatchProbability = tempCon;
		try {
		    eggImage = ImageIO.read(new File(""));
		} catch (IOException e) {
		}
	}
	private void createAppenzeller()
	{
		double[] tempCon = {};
		hatchProbability = tempCon;
		try {
		    eggImage = ImageIO.read(new File(""));
		} catch (IOException e) {
		}
	}
	private void createPhoenix()
	{
		double[] tempCon = {};
		hatchProbability = tempCon;
		try {
		    eggImage = ImageIO.read(new File(""));
		} catch (IOException e) {
		}
	}
	private void createDino()
	{
		double[] tempCon = {};
		hatchProbability = tempCon;
		try {
		    eggImage = ImageIO.read(new File(""));
		} catch (IOException e) {
		}
	}
	private void createTerminator()
	{
		double[] tempCon = {};
		hatchProbability = tempCon;
		try {
		    eggImage = ImageIO.read(new File(""));
		} catch (IOException e) {
		}
	}
}
