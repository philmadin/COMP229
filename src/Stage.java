import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Stage{
	

	static JFrame window = new JFrame("Sheep and Wolves");
	static Grid rootGrid = new Grid();
	static JPanel innerWindowBackground = new JPanel(new BorderLayout());
	
	static void mainer() {
		System.out.println("~~~~~");
		System.out.println("Sheep and Wolves");
		System.out.println("~~~~~");
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setPreferredSize(new Dimension(1280,720));
		

		rootGrid.setPreferredSize(new Dimension(1280,720));
		Character[] c = new Character[3]; 
		c[0] = new Wolf();
		c[1] = new Sheep();
		c[2] = new Shepherd();
		for(Character temp: c){
			//root.space[temp.location.exVal][temp.location.whyVal].cellColor=temp.location.cellColor;
		}
		//window.add(rootGrid.innerWindowBackground);
		window.add(rootGrid);
		window.pack();		
		window.setVisible(true);
	}
	public static void main(String[] args){
		mainer();
	}
}
