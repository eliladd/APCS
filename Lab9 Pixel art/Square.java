import java.awt.Color;
import java.awt.Graphics;
public class Square {
    private int x, y;
    private int red, green, blue;
    private int size;
    public Square(int x, int y, int red, int green, int blue, int size)
    {
        this.x = x+20;
        this.y = y+20;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.size = size;
    }
    public void drawMe(Graphics g)
    {
        g.setColor(new Color(red, green, blue));
        g.fillRect(x, y, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
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
