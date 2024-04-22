import java.util.ArrayList;

abstract class Polygon{
    private String name;
    public Polygon(String name){
        this.name = name;
    }
    abstract void calcArea();
    public void printInfo(){
        System.out.println("My name is " + name);
    }
    public String getName(){
        return name;
    }
}
//create a class Rectangle that extends Polygon
class Rectangle extends Polygon{
    private int width,  length;
    public Rectangle(String name, int width, int length){
        //using the parents constructor additionally to adding extra stuff
        super(name);
        this.width = width;
        this.length = length;
    }
    //implement the abstract method calcArea
    public void calcArea(){
        System.out.println("my name is " + super.getName() + " and my area is "+ length*width);
    }
    //override the printInfo method
    public void printInfo(){
        super.printInfo();
        System.out.println("my length is " + length + " and my width is "+width);
    }
}
class Triangle extends Polygon{
    private double base,  height;
    public Triangle(String name, double base, double height){
        //using the parents constructor additionally to adding extra stuff
        super(name);
        this.base = base;
        this.height = height;
    }
    //implement the abstract method calcArea
    public void calcArea(){
        System.out.println("my name is " + super.getName() + " and my area is "+ .5*height*base);
    }
    //override the printInfo method
    public void printInfo(){
        super.printInfo();
        System.out.println("my height is " + height + " and my base is "+base);
    }
}



public class Runner {
    public static void main(String[] args) {
        //create an arraylist of Polygon
        ArrayList<Polygon> polygons = new ArrayList<Polygon>();
        polygons.add(new Rectangle("Rectangle", 8, 13));
        polygons.add(new Triangle("Triangle", 5, 7));
        for(Polygon p: polygons){
            p.calcArea();
            p.printInfo();
        }

    }
}
