import java.awt.Color;

public class Wolf extends Character{
	public Wolf(){
		location = new Cell();
		location.exVal=10;
		location.whyVal=10;
		location.cellColor=new Color(200,0,0);
	}

}
