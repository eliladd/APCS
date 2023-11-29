import java.awt.Color;
import java.awt.Graphics;

// This class creates and moves one raindrop
public class Star{
	//location of the raid drop
	private int x, y;
	private Color white; //color of the raindrop
	
	public Star(int x, int y){
		this.x = x;
		this.y = y;
		white = new Color(255,255,255);
	}
	//draw the raindrop
	public void drawStar(Graphics g) {
		g.setColor(white);
		g.fillOval(x, y, 3, 7);
	}
	//move the stars to the left
	public void moveLeft() {
		x -= 2;
		
		//randomly move the stars up or down
		if ((int)Math.floor(Math.random() * (1 - 0 + 1) + 0) == 1){
			y--;
		}
		else{
			y++;
		}
		//occasionally stop the stars from moving
		if ((int)Math.floor(Math.random() * (5 - 0 + 1) + 0) == 1){
			x+= 2;
		}
		
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
			//System.out.println("y reset to 0");
		}
		if(y < -5){
			y=600;
			//System.out.println("y reset to 600");
		}
	}
	
}