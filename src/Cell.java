import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JPanel;

import org.w3c.dom.events.MouseEvent;


public class Cell extends Canvas implements MouseListener{
	
	static int gameSize=34;
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
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
