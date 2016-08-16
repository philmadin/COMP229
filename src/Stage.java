import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

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
		
		window.pack();		
		window.setVisible(true);
	}
	public static void main(String[] args){
		Stage temp = new Stage();
		temp.mainer();
	}
}
