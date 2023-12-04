import java.awt.Color;
import java.awt.Graphics;

public class Enemy {
    private int x, y, width, height;
	private Color blue;
	private String direction;
	private int speed;
	private boolean visible;
	public Enemy(int x, int y, int speed, boolean visible){
		//set up instance variables
		this.x = x;
		this.y = y;
		this.speed = speed * 2;
		width = 50;
		height = 50;
		blue = new Color(0,0,255);
		direction = "left";
		this.visible = visible;
	}
	//draw the ship
	public void draw(Graphics g){
		if (visible){
			g.setColor(blue);
			g.fillRect(x,y,width,height);
		}
	}
	public int getX(){
		return x;
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
