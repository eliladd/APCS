public class Rect{
    private int length;
    private int width;
    private int area;
    public Rect(){
        length = 0;
        width = 0;
        area = 0;
    }
    public Rect(int aLength, int aWidth){
        length = aLength;
        width = aWidth;
    }
    private void printarea(){
        System.out.println(area);
    }
    public void calcArea(){
        area = length * width;
        printarea();
    }
    public void calcArea(int num1, int num2){
        area = num1 * num2;
        printarea();
    }
}