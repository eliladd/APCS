public class Rectangle {
    private int lenght;
    private int width ;
    private int area;

    public Rectangle(){
         lenght = 0;
         width  = 0;       
    }
    public Rectangle(int b, int h){
         lenght = b;
         width  = h;       
    }
    public void printArea(){
        int area = lenght * width ;
        System.out.println("The area is " + area);
    }
}