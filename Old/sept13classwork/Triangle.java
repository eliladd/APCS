public class  Triangle{
    private int base;
    private int height;
    private double area;

    public Triangle(){
         base = 0;
         height = 0;       
    }
    public Triangle(int b, int h){
         base = b;
         height = h;       
    }
    public void printArea(){
        area = base * height * .5;
        System.out.println("The area is " + area);
    }

}