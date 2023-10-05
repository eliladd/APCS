package Old.Quiz3;
public class MethodQuiz {
    //instance variables
    double pi = 0;
    int radius = 0;
    //setting variables
    public void setvariables(){
        pi = 3.14;
        radius = 5;
    }
    //print surface area of sphere
    public void printSurfaceArea(){
        double sa = 4 * pi * radius * radius;
        System.out.println("The serface area is " + sa);
    }
    //print volume of sphere
    public void printVolume(){
        double vol = 1.33 * pi * radius * radius* radius;
        System.out.println("The volume is " + vol);
    }
}
