import java.awt.Color;
import java.awt.Graphics;
public class Square {
    private int x, y;
    private int red, green, blue;
    private int size;
    public Square(int x, int y, int red, int green, int blue, int size)
    {
        this.x = x;
        this.y = y;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.size = size;
    }
    public void drawMe(Graphics g)
    {
        g.setColor(new Color(red, green, blue));
        g.fillRect(x, y, size, size);
    }
}
