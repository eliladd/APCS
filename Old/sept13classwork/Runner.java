public class Runner{
	public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 3);
        Triangle t1 = new Triangle(); 
        Triangle t2 = new Triangle(5, 3); 
        r1.printArea();
        r2.printArea();
        t1.printArea();
        t2.printArea();
	}
}
