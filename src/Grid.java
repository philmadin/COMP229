import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid extends JPanel {
	
	static int gameLength=20;
	Cell[][] space = new Cell[gameLength][gameLength];
	JFrame window = new JFrame("Sheep and Wolves");
	JPanel windowBackground = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
	JPanel innerWindowBackground = new JPanel(new BorderLayout());
	JPanel gridBackground = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));

	public Grid() { 
		
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
		innerWindowBackground.add(windowBackground,BorderLayout.CENTER);
		window.add(innerWindowBackground);
		window.pack();		
		window.setVisible(true);	
		
	}
}
