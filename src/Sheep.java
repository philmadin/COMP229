import java.awt.Color;
import java.awt.Graphics;

public class Sheep extends Character{

	public Sheep(){
		location.cellColor=new Color(255,255,255);
		location.exVal = (int) (Math.random()*19);
		location.whyVal = (int) (Math.random()*19);		
	}

	public void paint(Graphics g) {
		location.paint(g);
		
	}
}
