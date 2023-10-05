import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

//(5) What is imported to get Graphics to work? JPANEL, AND THINGS THAT JPANEL WANTS, LIKE COLOR GRAPHICS AND DEMENSION
public class GuiCircle extends JPanel {
	private int x, y;

	public GuiCircle() {
		
		x = 400;
		y = 200;
	}

	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//(6) What is being drawn? dark red
		Color colorRed = new Color(128, 0, 0);
		g.setColor(colorRed);
		g.fillOval(x,y,100,100);
	}
}