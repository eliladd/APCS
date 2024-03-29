import java.util.ArrayList;

abstract class Solid {
    private String name;
    public Solid(String name){
        this.name = name;
    }
    
    public abstract void calcVolume();
    
    public void printInfo(){
        System.out.println("my name is " + name);
    }
}
class RectangularPrism extends Solid{
    private double length, width, height;
    public RectangularPrism(String name, double length, double width, double height){
        super(name);
        this.length = length;
        this.height = height;
        this.width = width;
    }
    public void calcVolume(){
        System.out.println("the volume is "+ length*width*height);
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("my width is " + width);
        System.out.println("my length is " + length);
        System.out.println("my height is " + height);
    }
}
class Sphere extends Solid{
    private double radius;
    public Sphere(String name, double radius){
        super(name);
        this.radius = radius;
    }
    public void calcVolume(){
        System.out.println("the volume is "+ (4/3)*Math.PI*radius*radius*radius);
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("my radius is " + radius);
    }
}

public class SolidRunner {
    public static void main(String[] args) {
        ArrayList<Solid> items = new ArrayList<Solid>();
        items.add(new RectangularPrism("RecPrism", 10.5, 7, 3));
        items.add(new Sphere("Sphere", 4));
        for(Solid i : items){
            i.printInfo();
            i.calcVolume();
        }

    }
}
