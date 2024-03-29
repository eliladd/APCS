import java.awt.Graphics;
import java.awt.Color;

public class SmallCar extends Automobile{
    private int frameW, frameH;
    //constructor  
    public SmallCar(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
        frameW = 70;
        frameH = 20;
    }
    @Override
    public void drawFrame(Graphics g){
        g.setColor( super.getColor() );
        g.fillRect(super.getX(),super.getY(),frameW,frameH);
    }
    @Override
    public void drawWheels(Graphics g){
        g.setColor( Color.black );
        g.fillOval(super.getX()+5,super.getY()+10, 20, 20);
        g.fillOval(super.getX()+50,super.getY()+10, 20, 20);
    }
    public int getWidth(){
        return frameW;
    }
    
}
class CompactCar extends SmallCar{
    private int frameW, frameH;
    //constructor  
    public CompactCar(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
        frameW = 60;
        frameH = 15;
    }
    //Override to make a 4-door frame
    @Override
    public void drawFrame(Graphics g){
        g.setColor( super.getColor() );
        g.fillRect(super.getX(),super.getY(),frameW,frameH);
        g.fillRect(super.getX(),super.getY()+5,frameW,frameH);
    }
    public int getWidth(){
        return frameW;
    }
}
class SmallSportsCar extends SmallCar{
	
    public SmallSportsCar(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
    }

    @Override
    public void drawFrame(Graphics g) {
        super.drawFrame(g);

        int width = super.getWidth();

        int[] xArray = new int[3];
        int[] yArray = new int[3];

        xArray[0] = super.getX() + width;
        yArray[0] = super.getY();

        xArray[1] = super.getX() + width;
        yArray[1] = super.getY() + 25;

        xArray[2] = super.getX() + width + 15;
        yArray[2] = super.getY() +25;

        g.fillPolygon(xArray, yArray, 3);

    }
}
