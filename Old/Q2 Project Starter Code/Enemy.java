
import java.awt.Graphics;

import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;

import javax.swing.ImageIcon;


import java.awt.Image;

import java.awt.image.BufferedImage;
public class Enemy {
    private int x, y, width, height, exploded = 0;
	private String direction;
	private BufferedImage ship;
	private int speed;
	private boolean visible;
	
	public Enemy(int x, int y, int speed, boolean visible){
		//set up instance variables
		this.x = x;
		this.y = y;
		this.speed = speed * 2;
		width = 50;
		height = 50;
		direction = "left";
		this.visible = visible;
		try{
			ship = ImageIO.read(new File("tieFighter.png"));
			
		}
		catch(IOException  e){
			System.out.println("error loading image");
		}
	}
	//draw the ship
	public void draw(Graphics g){
		if (visible){
			g.drawImage(ship, x, y, null);
		}
		else{
			if (exploded < 15){
				ImageIcon icon = new ImageIcon("explodeCircle.gif");
        		Image image = icon.getImage();
				g.drawImage(image, x-50, y-50, null);
				exploded++;
			}
			
		}
	}
	public int getX(){
		return x;
	}
	public void resetExploded(){
		exploded = 0;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public void setVisible(){
		visible = true;
	}
	public void changeX(int x){
		this.x = x;
	}
	public void changeY(int y){
		this.y = y;
	}
	public int getY(){
		return y;
	}
	public int getWidth(){
		return width;
	}
	public int getHight(){
		return height;
	}
	public boolean getVisible(){
		return visible;
	}
	//randomly moves the enemy to the left, up, or down
	public void move(){
		int rand = (int)(Math.random()*10);
		if (rand == 1){
			//change direction
			rand = (int)(Math.random()*5);
			if (rand == 1){
				direction = "up";
			}
			else if (rand == 2){
				direction = "down";
			}
			else{
				direction = "left";
			}

		}
		if (direction.equals("up")){
			y-=speed;
			if (y<0){
				y=0;
			}
		}
		else if (direction.equals("down")){
			y+=speed;
			if (y>550){
				y=550;
			}
		}
		else{
			x-=speed;
		}
		//reset enemy position if it goes out of bounds
	}

	public void dissapear(){
		visible = false;
		
	}
}
