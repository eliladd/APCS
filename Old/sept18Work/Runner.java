public class Runner {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);
        
        c1.printVol();
        c2.printVol();
        c1.printArea();
        c1.printArea(5.0);
        c2.printArea();
        c2.printArea(5.0);
        c2.printVol(7.0, 10.0);
    }
}
