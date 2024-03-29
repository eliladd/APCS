import java.awt.Graphics;
import java.awt.Color;

abstract public class Automobile{

	private Color bodyColor;
	private int x;
	private int y;
	
	
	public Automobile(Color bodyColor, int x, int y){
        
		this.bodyColor = bodyColor;
		this.x = x;
		this.y = y;

	}

		
	public void drawCar(Graphics g){
		this.drawFrame(g);
		this.drawWheels(g);
	}
	
	abstract public void drawFrame(Graphics g);
	
	abstract public void drawWheels(Graphics g);
    public Color getColor(){
        return bodyColor;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
	public void move(int dx){
		x += dx;
		
	}
	
}