import java.awt.Color;

public class Sheep extends Character{

	public Sheep(){
		location = new Cell();
		location.exVal=15;
		location.whyVal=15;
		location.cellColor=new Color(200,200,200);
	}
}
