import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class Grid extends JPanel{
	
	static int gameLength=20;
	Cell[][] space = new Cell[gameLength][gameLength];
	JFrame window = new JFrame("Sheep and Wolves");
	JPanel windowBackground = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
	JPanel innerWindowBackground = new JPanel(new BorderLayout());
	//JPanel gridBackground = new JPanel(new GridLayout(20,20));
	JPanel gridBackground = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
	//JPanel controlsBackground = new JPanel();

	public Grid() { 
		Border border = gridBackground.getBorder();
		Border margin = new EmptyBorder(0,0,0,0);
		gridBackground.setBorder(new CompoundBorder(border, margin));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		innerWindowBackground.setPreferredSize(new Dimension(1280,720));
		windowBackground.setPreferredSize(new Dimension(700,700));
		gridBackground.setPreferredSize(new Dimension(700,700));
		for(int i=0;i<gameLength;i++){
			for(int j=0;j<gameLength;j++){
				
				space[i][j]=new Cell();
				space[i][j].setSize(35,35);

				gridBackground.add(space[i][j]);	
				
			}
		}
		windowBackground.add(gridBackground);
		JButton jbnSampleButtons = new JButton("Button 3 (LINE_START)");
		jbnSampleButtons.setSize(10,10);
		innerWindowBackground.add(jbnSampleButtons, BorderLayout.PAGE_START);
		innerWindowBackground.add(windowBackground,BorderLayout.CENTER);
		window.add(innerWindowBackground);
		window.pack();
		window.setVisible(true);	
		
	}
}
