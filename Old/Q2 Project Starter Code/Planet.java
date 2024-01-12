import java.awt.Color;
import java.awt.Graphics;

// This class creates and moves one raindrop
public class Planet{
	//location of the raid drop
	private int x, y, speed, size, rcolor, gcolor, bcolor, opacity;
	private Color planetColor; //color of the raindrop
	private Color SkyBlue = new Color(135,206,250);
	
	public Planet(int x, int y, int speed){
		this.x = x;
		this.y = y;
		this.speed = speed;
		//create a random color and size for the raindrop
		rcolor = (int)Math.floor(Math.random() * (255 - 0 + 1) + 0);
		gcolor = (int)Math.floor(Math.random() * (255 - 0 + 1) + 0);
		bcolor = (int)Math.floor(Math.random() * (255 - 0 + 1) + 0);
		opacity = (int)Math.floor(Math.random() * (255 - 0 + 1) + 0);
		planetColor = new Color(rcolor,gcolor,bcolor, opacity);
		size = (int)Math.floor(Math.random() * (100 - 20 + 1) + 3);
	}
	//draw the raindrop
	public void drawPlanet(Graphics g) {
		g.setColor(SkyBlue);
		g.fillRect(0,0,800,600);
		g.setColor(planetColor);
		g.fillOval(x, y, size, size+1);
	}
	//move the planet to the left
	public void moveLeft() {
		x -= speed;
		//reset planet position if it goes out of bounds
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