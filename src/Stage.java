import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Stage{

	static JFrame window;
	static JPanel base;
	static Grid rootGrid;
	
	void mainer() {
		System.out.println("~~~~~");
		System.out.println("Sheep and Wolves");
		System.out.println("~~~~~");
		window = new JFrame("Sheep and Wolves");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		base =  new JPanel(new FlowLayout(FlowLayout.LEFT));
		base.setPreferredSize(new Dimension(1280,720));
		window.add(base);
		
		rootGrid = new Grid();
		base.add(rootGrid);
		Character[] c = new Character[3]; 
		c[0] = new Wolf();
		c[1] = new Sheep();
		c[2] = new Shepherd();
		for(Character temp: c){
			rootGrid.abstractArray.space[temp.location.exVal][temp.location.whyVal].cellColor=temp.location.cellColor;
		}
		
		window.pack();		
		window.setVisible(true);
	}
	public static void main(String[] args){
		Stage temp = new Stage();
		temp.mainer();
	}
}
