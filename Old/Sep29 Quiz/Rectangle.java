public class Rectangle {
    //instance variables
    private double length;
    private double width;
    //overloading rectangle to set instance variables
    public Rectangle(){
        length = 0.0;
        width = 0.0;

    }
    public Rectangle(double aWidth, double aLength){
        length = aLength;
        width = aWidth;
    }
    //calculate and print area
    public void printArea(){
        double area = length * width;
        System.out.println("The area is " + area);
    }
}
