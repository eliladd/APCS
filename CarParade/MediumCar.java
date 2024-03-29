import java.awt.Color;
import java.awt.Graphics;
public class MediumCar extends Automobile{
    /*+ drawFrame(Graphics): void - Override to add a frame, lights, and windows. Has a larger frame size than SmallCar, but smaller than BigCar.
+ drawWheels(Graphics): void - Override to draw the wheels.
 */
    private int frameW, frameH;
    //constructor  
    public MediumCar(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
        frameW = 80;
        frameH = 25;
    }
    @Override
    public void drawFrame(Graphics g){
        g.setColor( super.getColor() );
        g.fillRect(super.getX(),super.getY(),frameW,frameH);
        //draw windows
        g.setColor( Color.black );
        g.fillRect(super.getX()+5,super.getY()+5,frameW/4,frameH-10);
        g.fillRect(super.getX()+frameW-5-frameW/4,super.getY()+5,frameW/4,frameH-10);
        //draw lights
        g.setColor( Color.yellow );
        g.fillOval(super.getX()+frameW-5,super.getY()+frameH/2-5, 10, 10);
        g.fillOval(super.getX()-5,super.getY()+frameH/2-5, 10, 10);

    }
    @Override
    public void drawWheels(Graphics g){
        g.setColor( Color.black );
        g.fillOval(super.getX()+5,super.getY()+20, 20, 20);
        g.fillOval(super.getX()+55,super.getY()+20, 20, 20);
    }
}
class Sedan extends MediumCar{
    private int frameW, frameH;
    //constructor  
    public Sedan(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
        frameW = 90;
        frameH = 30;
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
        //draw lights
        g.setColor( Color.yellow );
        g.fillOval(super.getX()+frameW-5,super.getY()+frameH/2-5, 10, 10);
        g.fillOval(super.getX()-5,super.getY()+frameH/2-5, 10, 10);
    }
    public int getWidth(){
        return frameW;
    }
}
class SportsCar extends MediumCar{
    private int frameW, frameH;
    //constructor  
    public SportsCar(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
        frameW = 70;
        frameH = 20;
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
        //draw lights
        g.setColor( Color.yellow );
        g.fillOval(super.getX()+frameW-5,super.getY()+frameH/2-5, 10, 10);
        g.fillOval(super.getX()-5,super.getY()+frameH/2-5, 10, 10);
    }
    public int getWidth(){
        return frameW;
    }
}
