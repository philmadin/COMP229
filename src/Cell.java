import java.awt.Canvas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;

public class Cell extends Canvas implements MouseListener{
	
	public Color cellColor=new Color(0,0,(int)(Math.random()*255));
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
		g.setColor(cellColor);
		g.fillRect(0, 0, gameSize, gameSize);
		this.addMouseListener(this);
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
		e.getComponent().getGraphics().clearRect(0, 0, gameSize, gameSize);
		Graphics g = e.getComponent().getGraphics();
		g.setColor(new Color(75,75,75));
		g.fillRect(0, 0, gameSize, gameSize);
	}
	
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		e.getComponent().getGraphics().clearRect(0, 0, gameSize, gameSize);
		Graphics g = e.getComponent().getGraphics();
		this.paint(g);
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
