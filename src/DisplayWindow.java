import java.awt.*;

import javax.swing.*;


public class DisplayWindow extends JPanel{
	public void paint(Graphics g){
	    super.paintComponent(g);
	    Cell[][] space = new Cell[20][20];
	    int xstart=10;
	    int ystart=10;
	    for(int i=0;i<space[0].length*space[0].length;i++){
	        g.drawRect(xstart, ystart, 35, 35);
	        xstart = xstart+35;
	        if(xstart>700){
	        	xstart=xstart%35;
	        	ystart=ystart+35;
	        }    	
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("~~~~~");
		System.out.println("Sheep and Wolves");
		System.out.println("~~~~~");
	    //GridLayout gridLayout = new GridLayout(20,20);

		JFrame frame = new JFrame("Sheep and Wolves");
		DisplayWindow cellDrawer = new DisplayWindow();
		cellDrawer.setPreferredSize(new Dimension(1280,720));
		
		frame.add(cellDrawer);
		frame.pack();
		frame.setVisible(true);
		System.out.println(frame.getSize());
		
	}

}
