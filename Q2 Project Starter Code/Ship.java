import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class Ship{
	//location of ship
	private int x, y;
	private Color blue;
	private Projectile pObj;
	private BufferedImage spaceship;
	private boolean fire;
	public Ship(int x, int y){
		//set up instance variables
		this.x = x;
		this.y = y;
		blue = new Color(0,0,255);
		pObj = new Projectile(x,y);
		fire = false;
		try{
			spaceship = ImageIO.read(new File("Spaceship.png"));
		}
		catch(IOException  e){
			System.out.println("error loading image");
		}
	}
	//draw the ship and call to draw projectile if fire is true
	public void draw(Graphics g){
		if(fire){
			pObj.draw(g);
		}
		g.drawImage(spaceship, x, y, null);

	}
	public void moveUp(){
		y-=5;
		if (!fire){
			pObj.reset(x, y);
		}
	}
	public void moveDown(){
		y+=5;
		if (!fire){
			pObj.reset(x, y);
		}
	}
	public void setfire(){
		fire = true;
	}
	public void moveProjectile(int limit){
		//move the projectile if fire is true
		if (fire){
			pObj.move();
			//did the projectile hit the end of the panel
			if (pObj.getX() > limit){
				pObj.reset(x,y);
				fire = false;
			}
		}
	}
}
