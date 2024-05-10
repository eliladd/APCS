import java.awt.Color;
import java.awt.Graphics;
public class BigCar extends Automobile{
    private int frameW, frameH;
    //constructor  
    public BigCar(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
        frameW = 100;
        frameH = 30;
    }
    @Override
    public void drawFrame(Graphics g){
        g.setColor( super.getColor() );
        g.fillRect(super.getX(),super.getY(),frameW,frameH);
        //draw windows
        g.setColor( Color.black );
        g.fillRect(super.getX()+5,super.getY()+5,frameW/4,frameH-10);
        g.fillRect(super.getX()+frameW-5-frameW/4,super.getY()+5,frameW/4,frameH-10);
        g.fillRect(super.getX()+5,super.getY()+5+frameH,frameW/4,frameH-10);
        g.fillRect(super.getX()+frameW-5-frameW/4,super.getY()+5+frameH,frameW/4,frameH-10);
        //draw lights
        g.setColor( Color.yellow );
        g.fillOval(super.getX()+frameW-5,super.getY()+frameH/2-5, 10, 10);
        g.fillOval(super.getX()-5,super.getY()+frameH/2-5, 10, 10);
    }
    @Override
    public void drawWheels(Graphics g){
        g.setColor( Color.black );
        g.fillOval(super.getX()+5,super.getY()+20, 20, 20);
        g.fillOval(super.getX()+75,super.getY()+20, 20, 20);
    }
}
class SUV extends BigCar{
    private int frameW, frameH;
    //constructor  
    public SUV(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
        frameW = 110;
        frameH = 35;
    }
    //Override to make a 4-door frame
    @Override
    public void drawFrame(Graphics g){
        g.setColor( super.getColor() );
        g.fillRect(super.getX(),super.getY(),frameW,frameH);
        g.fillRect(super.getX(),super.getY()+5,frameW,frameH);
        //draw windows
        g.setColor( Color.black );
        g.fillRect(super.getX()+5,super.getY()+5,frameW/4,frameH-10);
        g.fillRect(super.getX()+frameW-5-frameW/4,super.getY()+5,frameW/4,frameH-10);
        g.fillRect(super.getX()+5,super.getY()+5+frameH,frameW/4,frameH-10);
        g.fillRect(super.getX()+frameW-5-frameW/4,super.getY()+5+frameH,frameW/4,frameH-10);
        g.fillRect(super.getX()+5,super.getY()+5+frameH*2,frameW/4,frameH-10);
        g.fillRect(super.getX()+frameW-5-frameW/4,super.getY()+5+frameH*2,frameW/4,frameH-10);
        g.fillRect(super.getX()+5,super.getY()+5+frameH*3,frameW/4,frameH-10);
        g.fillRect(super.getX()+frameW-5-frameW/4,super.getY()+5+frameH*3,frameW/4,frameH-10);
        //draw lights
        g.setColor( Color.yellow );
        g.fillOval(super.getX()+frameW-5,super.getY()+frameH/2-5, 10, 10);
        g.fillOval(super.getX()-5,super.getY()+frameH/2-5, 10, 10);
    }
    public int getWidth(){
        return frameW;
    }
}
class Truck extends BigCar{
    private int frameW, frameH;
    //constructor  
    public Truck(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
        frameW = 120;
        frameH = 40;
    }
    //Override to make a 2-door frame
    @Override
    public void drawFrame(Graphics g){
        g.setColor( super.getColor() );
        g.fillRect(super.getX(),super.getY(),frameW,frameH);
        g.fillRect(super.getX(),super.getY()+5,frameW,frameH);
        //draw windows
        g.setColor( Color.black );
        g.fillRect(super.getX()+5,super.getY()+5,frameW/4,frameH-10);
        g.fillRect(super.getX()+frameW-5-frameW/4,super.getY()+5,frameW/4,frameH-10);
        g.fillRect(super.getX()+5,super.getY()+5+frameH,frameW/4,frameH-10);
        g.fillRect(super.getX()+frameW-5-frameW/4,super.getY()+5+frameH,frameW/4,frameH-10);
        //draw lights
        g.setColor( Color.yellow );
        g.fillOval(super.getX()+frameW-5,super.getY()+frameH/2-5, 10, 10);
        g.fillOval(super.getX()-5,super.getY()+frameH/2-5, 10, 10);
    }
    public int getWidth(){
        return frameW;
    }
}