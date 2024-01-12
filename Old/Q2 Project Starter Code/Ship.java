import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class Ship{
	//location of ship
	private int x, y, collisions = 0, fired = 0;
	int[] intArray = new int[20];
	private Projectile pObj[] = new Projectile[500];
	private BufferedImage spaceship, ship2;
	private boolean fire;
	private GamePanel game;
	public Ship(int x, int y){
		//set up instance variables
		this.x = x;
		this.y = y;
		for(int i = 0; i<pObj.length; i++){
			pObj[i] = new Projectile(x,y);
		}
		fire = false;
		try{
			spaceship = ImageIO.read(new File("xWing.png"));
			ship2 = ImageIO.read(new File("ship2.png"));
		}
		catch(IOException  e){
			System.out.println("error loading image");
		}
	}
	//draw the ship and call to draw projectile if fire is true
	public void draw(Graphics g){
		for(Projectile each : pObj){
			each.draw(g);
			each.nonFired(x,y+25);
		}
		
		g.drawImage(spaceship, x, y, null);

	}
	public void draw2(Graphics g){
		for(Projectile each : pObj){
			each.draw(g);
			each.nonFired(x,y+25);
		}
		
		g.drawImage(ship2, x, y, null);

	}
	public void reset(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void moveUp(){
		y -= 5;
		if (y<0){
			y = 0;
		}
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void resetPos(){
		y = 300;
	}
	public void moveDown(){
		y += 5;
		if (y>550){
			y = 550;
		}
	}
	public int getCollisions(){
		return collisions;
	}
	public void resetCollisions(){
		collisions = 0;
	}
	public void setfire(){
		fired++;
		if(fired >= pObj.length){
			fired = 0;
		}
		//System.out.println("fired: " + fired);
		pObj[fired].fire(true);
		//System.out.println("set fire true"); 
		
	}
	public void moveProjectile(int limit){
		//move the projectile if fire is true
		for(Projectile each : pObj){
			if (each.getFire()){
				each.move();
				if (each.getX() > limit){
					each.reset(x,y);
					fire = false;
					//System.out.println("fire reset");
				}
			}
		}
	}
	// Check to see if the projectile has hit an enemy
	public void setFire(boolean fire){
		this.fire = fire;
	}
	public boolean checkProjectileCollision(Enemy e){
		for(Projectile each : pObj){
			if( e.getVisible() ){ //checkCollision only when the enemy is visible
				//ship projectile
				int pX = each.getX();
				int pY = each.getY();
				int pWidth = each.getWidth();
				int pHeight = each.getHeight();
				//enemy
				int eX = e.getX();
				int eY = e.getY();
				int eWidth = e.getWidth();
				int eHeight = e.getHight();
				
				if( pX+pWidth >= eX && pX <= eX + eWidth  &&  
					pY+pHeight >= eY && pY <= eY + eHeight ) {
					//System.out.println("Collision"); // for testing 
					collisions++;
					e.dissapear();
					each.reset(x,y);	
					setFire(false);
					return true;
				}
			}
		}
		return false;
	}
	public boolean checkEnemyCollision(Enemy e){
		if( e.getVisible() ){
			//ship
			int sX = x;
			int sY = y;
			int sWidth = 50;
			int sHeight = 50;
			//enemy
			int eX = e.getX();
			int eY = e.getY();
			int eWidth = e.getWidth();
			int eHeight = e.getHight();
			
			if( sX+sWidth >= eX && sX <= eX + eWidth  &&  
				sY+sHeight >= eY && sY <= eY + eHeight ) {
				//System.out.println("ENEMY Collision"); // for testing 
				collisions++;
				e.dissapear();
				return true;
			}
			
		}
		return false;
	}
}
