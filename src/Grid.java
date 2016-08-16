import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid extends JPanel{
	
	static int gameLength=20;
	public Cell[][] space = new Cell[gameLength][gameLength];
	JPanel gridBackground = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));

	public Grid() { 
		gridBackground.setPreferredSize(new Dimension(700,700));
		for(int i=0;i<gameLength;i++){
			for(int j=0;j<gameLength;j++){
				space[i][j]=new Cell();
				space[i][j].setSize(35,35);
				gridBackground.add(space[i][j]);
			}
		}
		this.add(gridBackground);
	}
	
}
