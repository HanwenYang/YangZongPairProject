import javax.swing.*;

public class SwingTester
{
	private static JFrame window;
	private static JPanel viewingWindow;
	private static JLabel text;
	
	public static void main(String[] args)
	{
		//testSleep();
		createWindow();
		testInterface();
	}
	public static void testSleep()
	{
		String[] message = {"H","e","l","l","o"," ","W","o","r","l","d","!"};
		for (int i = 0; i < 12; i++)
		{
			System.out.print(message[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void createWindow()
	{
		window = new JFrame();
		viewingWindow = new JPanel();
		text = new JLabel("waiting...");
		
		viewingWindow.add(text);
		window.add(viewingWindow);
		
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	public static void testInterface()
	{
		String[] message = {"H","e","l","l","o"," ","W","o","r","l","d","!"};
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		text.setText("");
		
		for (int i = 0; i < 12; i++)
		{
			text.setText(text.getText() + message[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
