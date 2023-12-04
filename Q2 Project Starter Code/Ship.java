import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class Ship{
	//location of ship
	private int x, y;
	private Projectile pObj;
	private BufferedImage spaceship;
	private boolean fire;
	public Ship(int x, int y){
		//set up instance variables
		this.x = x;
		this.y = y;
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
	// Check to see if the projectile has hit an enemy
	public boolean checkProjectileCollision(Enemy e){
		
		if( e.getVisible() ){ //checkCollision only when the enemy is visible
			//ship projectile
			int pX = pObj.getX();
			int pY = pObj.getY();
			int pWidth = pObj.getWidth();
			int pHeight = pObj.getHeight();
			//enemy
			int eX = e.getX();
			int eY = e.getY();
			int eWidth = e.getWidth();
			int eHeight = e.getHight();
			
			if( pX+pWidth >= eX && pX <= eX + eWidth  &&  
				pY+pHeight >= eY && pY <= eY + eHeight ) {
				System.out.println("Collision"); // for testing 
				e.dissapear();
				pObj.reset(x,y);	
				fire = false;
				return true;
				
			}
		}
		return false;
	}

}
