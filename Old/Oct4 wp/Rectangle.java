public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double aLength, double aWidth){
        length = aLength;
        width = aWidth;

    }
    public double getArea(){
        double area = length * width;
        return area;

    }
    public double getPerimeter(){
        double perimeter = width + width + length + length;
        return perimeter;

    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getVolume(double aHeight){
        double volume = width * length + aHeight;
        return volume;
    }
}
