public class Runner {
    public static void main(String[] args){
        //instanceate variables with overloading
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 7.5);
        //run method printArea
        r1.printArea();
        r2.printArea();
    }
}
