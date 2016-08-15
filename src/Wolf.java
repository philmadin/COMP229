import java.awt.Color;
import java.awt.Graphics;

public class Wolf extends Character{
	
	public Wolf(){
		location.cellColor=new Color(255,0,0);
		location.exVal = (int) (Math.random()*19);
		location.whyVal = (int) (Math.random()*19);		
	}

	public void paint(Graphics g) {
		
	}

}
