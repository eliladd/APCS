import java.awt.Color;
import java.awt.Graphics;

// Code that implements a projectile
public class Projectile {

    // Instance variables
    private int x, y;
    private int width, height;
    private Color red;
    private Ship ship;
    // Constructor
    public Projectile(int x, int y) {
        this.x = x;
        this.y = y;
        width = 10;
        height = 10;
        red = new Color(255, 0, 0);
    }
    //draw the projectile
    public void draw(Graphics g) {
        g.setColor(red);
        g.fillOval(x, y, width, height);
        g.fillOval(x, y+35, width, height);
    }
    //return the x value
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    //move the projectile
    public void move() {
        x += 6;
    }
    public void reset(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean checkProjectileCollision(Enemy e){
		
		if( e.getVisible() ){ //checkCollision only when the enemy is visible
			//ship projectile
			int pX = x;
			int pY = y;
			int pWidth = width;
			int pHeight = height;
			//enemy
			int eX = e.getX();
			int eY = e.getY();
			int eWidth = e.getWidth();
			int eHeight = e.getHight();
			
			if( pX+pWidth >= eX && pX <= eX + eWidth  &&  
				pY+pHeight >= eY && pY <= eY + eHeight ) {
				System.out.println("Collision"); // for testing 
				e.dissapear();
				reset(x,y);	
				ship.setFire(false);
				return true;
				
			}
		}
		return false;
	}
}