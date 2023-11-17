import java.awt.Color;
import java.awt.Graphics;

// This class creates and moves one raindrop
public class RainDrop{
	//location of the raid drop
	private int x, y;
	private Color blue; //color of the raindrop
	
	public RainDrop(int x, int y){
		this.x = x;
		this.y = y;
		blue = new Color(0,0,255);
	}
	//draw the raindrop
	public void drawRainDrop(Graphics g) {
		g.setColor(blue);
		g.fillOval(x, y, 3, 7);
	}
	//move the rain vertically
	public void moveDown() {
		y+= 2;
		if ((int)Math.floor(Math.random() * (3 - 0 + 1) + 0) == 3){
			x--;
		}
		else{
			x++;
		}
		if (y>600){
			y = - 5+ (int)Math.floor(Math.random() * (3 - 0 + 1) + 0);
			x = (int)Math.floor(Math.random() * (799 - 0 + 1) + 0);
		}
		if (x<-5){
			x = 805;
		}
		else if(x > 810){
			x=0;
		}
	}
	
}