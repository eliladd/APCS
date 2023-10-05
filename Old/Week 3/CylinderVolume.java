import java.lang.Math;
public class CylinderVolume {
    public static void main(String[] args){
        //set variables
        double radious = 5;
        double height = 12;
        //calculate volume
        double volume = Math.PI * radious * radious * height;
        //print volume and explination
        System.out.println("The volume of a cylinder with radius "+ radious + " and height " + height + " is " + volume);
    }
}
