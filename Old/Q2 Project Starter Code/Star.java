import java.awt.Color;
import java.awt.Graphics;

// This class creates and moves one raindrop
public class Star{
	//location of the raid drop
	private int x, y, speed, color, size;
	private Color white; //color of the raindrop
	
	public Star(int x, int y, int speed){
		this.x = x;
		this.y = y;
		this.speed = speed;
		if (speed == 0){
			color = 100;
			size = 3;

		}
		else if (speed == 1){
			color = 200;
			size = 4;
		}
		else if (speed == 2){
			color = 255;
			size = 4;
		}
		white = new Color(color,color,color);
	}
	//draw the raindrop
	public void drawStar(Graphics g) {
		g.setColor(white);
		g.fillOval(x, y, size, size+1);
	}
	//move the stars to the left
	public void moveLeft() {
		x -= speed;
		//reset star position if it goes out of bounds
		if (y>600){
			x = - 5+ (int)Math.floor(Math.random() * (3 - 0 + 1) + 0);
			y = (int)Math.floor(Math.random() * (799 - 0 + 1) + 0);
		}
		if (x<-5){
			x = 805;
		}
		//reset if stars go too far out of bounds
		if(y > 605){
			y=0;
		}
		if(y < -5){
			y=600;
		}
		 
	}
	
}