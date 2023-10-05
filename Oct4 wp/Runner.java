public class Runner {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(7.5, 4);
        double area, perimeter, length, width, volume;
        area = r1.getArea();
        perimeter = r1.getPerimeter();
        length = r1.getLength();
        width = r1.getWidth();
        volume = r1.getVolume(10);
        System.out.println("the Area is " + area + " and the length is "+length+" and the width is "+width+" and the perimiter is " + perimeter);
        System.out.print("The volume is "+ volume);
    }   
}
