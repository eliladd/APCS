public class Circle {
    double pi;
    double radius;
    double volume;
    double area;
    public Circle(){
        radius = 0;
        pi = 3.14;
        volume = 0;
    }
    public Circle(double radius){
        this.radius = radius;
        pi = 3.14;
        volume = 0;
    }
    private void calcVol(){
        volume = 1.33 * radius * radius * radius * pi;
    }
    private void calcVol(double radius, double height){
        volume = height * radius * radius * radius * pi;
    }
    public void printVol(){
        calcVol();
        System.out.println(volume);
    }
    public void printVol(double radius, double height){
        calcVol(radius, height);
        System.out.println(volume);
    }
    private void calcArea(){
        volume = pi * radius * radius;
    }
    private void calcArea(double radius){
        area = pi * radius * radius;
    }
    public void printArea(double radius){
        calcArea(radius);
        System.out.println(area);
    }
    public void printArea(){
        calcArea();
        System.out.println(volume);
    }
}
