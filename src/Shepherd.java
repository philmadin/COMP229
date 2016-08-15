import java.awt.Color;
import java.awt.Graphics;

public class Shepherd extends Character{

	public Shepherd(){
		location.cellColor=new Color(0,255,0);
		location.exVal = (int) (Math.random()*19);
		location.whyVal = (int) (Math.random()*19);		
	}

	public void paint(Graphics g) {
		
	}
}
