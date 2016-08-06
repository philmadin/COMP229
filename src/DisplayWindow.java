import java.awt.*;
 
import javax.swing.*;


import examplePackage.MyFirstPainter;

public class DisplayWindow extends JPanel{
	public void paint(Graphics g)
	{
	    int width = getWidth();
	    int height = getHeight();
	    super.paintComponent(g);

	    int xstart=10;
	    int ystart=10;

	    for(int i = 1; i <= 20; i++)
	    {
	        //g.drawLine(xstart, 10, xstart, height-10);
	        //g.drawLine(10, ystart, width-10, ystart);

	        xstart = xstart+35;
	        ystart = ystart+35;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("~~~~~");
		System.out.println("Sheep and Wolves");
		System.out.println("~~~~~");
	    GridLayout gridLayout = new GridLayout(20,20);

		JFrame frame = new JFrame("Sheep and Wolves");
		DisplayWindow p = new DisplayWindow();
		p.setLayout(gridLayout);
		JInternalFrame temp = new JInternalFrame();
		temp.setBackground(new Color(20));
		temp.setPreferredSize(new Dimension(10, 10));
		p.setPreferredSize(new Dimension(720,720));
		p.add(temp);
		temp.pack();
		temp.setVisible(true);
		
		frame.add(p);
		frame.pack();
		frame.setVisible(true);
		
	}

}
