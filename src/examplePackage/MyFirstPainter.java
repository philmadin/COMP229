package examplePackage;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
 
public class MyFirstPainter extends JPanel {
 
	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.blue);
		g2.fillRect(0, 0, this.getWidth(), this.getHeight());
 
		g2.setColor(Color.lightGray);
		g2.fillRect(10, 10, this.getWidth() - 20, this.getHeight() - 20);
 
		g2.setColor(Color.red);
 
		g2.drawString("Hello", 30, this.getHeight() / 2);
	}
 
	public static void main(String [] args) {
		JFrame frame = new JFrame("Hello");
		frame.setSize(300, 200);
 
		MyFirstPainter p = new MyFirstPainter();
		frame.add(p);
 
		frame.setVisible(true);
	}
 
}