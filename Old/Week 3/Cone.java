public class Cone {
    public static void main(String[] args){
        double volume = 0;
        double radious = 3;
        double pi = 3.14;
        double height = 6;
        volume = (pi * (radious * radious) * height) / 3.0;
        System.out.print("The volume of a cone with height " + height + " and a radious of " + radious + " is " + volume);
    }
}
