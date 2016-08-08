import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JPanel;


public class Cell extends Canvas{
	
	static int gameSize=35;
	static int counter=0;
	int squareID=0;
	int exVal =0;
	int whyVal=0;
	int spaceVal=0;

	public Cell() { 
		squareID=counter;
		exVal=squareID%20;
		whyVal=squareID/20;
		counter++;
		
	}
	public void paint(Graphics g){
		//System.out.println(exVal+"Y:"+whyVal);
		g.drawRect(0, 0, gameSize, gameSize);
	}
	public int getID(){
		return squareID;
	}

}
