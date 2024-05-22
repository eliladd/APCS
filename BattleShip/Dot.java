import java.awt.Color;
import java.awt.Graphics;
public class Dot {
    private int x, y;
    private int red, green, blue;
    private int size;
    public Dot(int x, int y, int red, int green, int blue, int size)
    {
        this.x = x+20;
        this.y = y+20;
        this.red = 10;
        this.green = 10;
        this.blue = 10;
        this.size = size;
    }
    public void drawMe(Graphics g)
    {
        g.setColor(new Color(red, green, blue));
        g.fillOval(x, y, 20,20);
    }
    public void changeColor(int red, int green, int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getSize()
    {
        return size;
    }
}
