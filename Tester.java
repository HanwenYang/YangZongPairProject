
public class Tester
{
	public static void main(String[] args)
	{
		testInventory();
	}
	public static void testInventory()
	{
		int[] counts = new int[7];
		for (int i = 0; i < 10000; i++)
		{
			Inventory temp = new Inventory();
			int[] tempCounts = temp.getEggCounts();
			tempCounts[0] -= 1;
			tempCounts[1] -= 1;
			for (int j = 0; j < tempCounts.length; j++)
				if (tempCounts[j] != 0)
				counts[j] += tempCounts[j];
		}
		for (int i = 0; i < counts.length; i++)
			System.out.print(counts[i] + " ");
	}
}
