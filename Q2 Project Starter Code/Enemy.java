import java.awt.Color;
import java.awt.Graphics;

public class Enemy {
    private int x, y;
	private Color blue;
	public Enemy(int x, int y){
		//set up instance variables
		this.x = x;
		this.y = y;
		blue = new Color(0,0,255);
	}
	//draw the ship
	public void draw(Graphics g){
		g.setColor(blue);
		g.fillRect(x,y,50,50);
	}
}
