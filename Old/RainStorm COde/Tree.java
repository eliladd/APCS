import java.awt.Color;
import java.awt.Graphics;

// This class creates and moves one raindrop
public class Tree{
	//location of the raid drop
	private int x, y;
	private Color colorBrown; //color of the raindrop
	
	public Tree(int x, int y){
		this.x = x;
		this.y = y;
		colorBrown = new Color(114, 95, 75);
	}
	//draw the raindrop
	public void drawTree(Graphics g) {
		g.setColor(colorBrown);
        g.fillRect(x, y, 25, 75);
        g.setColor(Color.green);
		g.fillOval(x-17, y-17, 60, 40);
	}
	
}