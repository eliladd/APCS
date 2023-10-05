    import java.util.Scanner;
    import java.lang.Math;
public class Formulas {

    private double pi = 3.14;
    Scanner sc = new Scanner(System.in);
    public void AreaTriangle(){
        System.out.print("What is the Height? ");
        double height = sc.nextDouble();
        System.out.print("What is the base? ");
        double base = sc.nextDouble();
        double area = .5 * base * height;
        System.out.print("The area is: "+area);
    }
    public void AreaRectange(){
        System.out.print("What is the Height? ");
        double height = sc.nextDouble();
        System.out.print("What is the base? ");
        double base = sc.nextDouble();
        double area =base * height;
        System.out.print("The area is: "+area);
    }
    public void Areacircle(){
        System.out.print("What is the Radious? ");
        double Radious = sc.nextDouble();
        double area = pi * Radious * Radious;
        System.out.print("The area is: "+area);
    }
    public void Volumepyrmid(){
        System.out.print("What is the length? ");
        double length = sc.nextDouble();
        System.out.print("What is the Width? ");
        double Width = sc.nextDouble();
        System.out.print("What is the Height? ");
        double Height = sc.nextDouble();
        double area = (length * Width *Height) / 3;
        System.out.print("The Volume is: "+area);
    }
    public void AreaCube(){
        System.out.print("What is the length? ");
        double length = sc.nextDouble();
        System.out.print("What is the Width? ");
        double Width = sc.nextDouble();
        System.out.print("What is the Height? ");
        double Height = sc.nextDouble();
        double area = (length * Width *Height);
        System.out.print("The area is: "+area);
    }
    public void AreaSphere(){
        System.out.print("What is the Radious? ");
        double Radious = sc.nextDouble();
        double area = pi * Radious * Radious * 4;
        System.out.print("The area is: "+area);
    }
    public void AreaCyllender(){
        System.out.print("What is the Radious? ");
        double r = sc.nextDouble();
        System.out.print("What is the height? ");   
        double h = sc.nextDouble();
        double area = (2 * pi * r * h)+(2*pi*(r*r));
        System.out.print("The area is: "+area);
    }
    public void Pythag(){
        System.out.print("What is the length of the shortest side? ");
        double a = sc.nextDouble();
        System.out.print("What is the length of the other non-hypotnuse? ");
        double b = sc.nextDouble();
        double c = (a*a) + (b*b);
        System.out.print("The hypotnuse's lenght is: "+c);
    }
    public void Quadraticformula(){
        System.out.print("ax^2 + bx + c");
        System.out.print("What is a? ");
        double a = sc.nextDouble();
        System.out.print("What is b? ");
        double b = sc.nextDouble();
        System.out.print("What is c? ");
        double c = sc.nextDouble();
        double pos = (((-1)*b)+Math.sqrt((b*b)-(4*a*c))) / (2*a);
        double neg = (((-1)*b)-Math.sqrt((b*b)-(4*a*c))) / (2*a);
        System.out.println("the answers are: ");
        System.out.println(pos);
        System.out.println("and");
        System.out.println(neg);
    }
    public void SlopeFormula(){
        System.out.print("What is the y value of your 2nd point? ");
        double y2 = sc.nextDouble();
        System.out.print("What is the y value of your 1st point? ");
        double y1 = sc.nextDouble();
        System.out.print("What is the x value of your 2nd point? ");
        double x2 = sc.nextDouble();
        System.out.print("What is the x value of your 1st point? ");
        double x1 = sc.nextDouble();
        double slope = (y2 - y1) / (x2 - x1);
    }
    public void forceFormula(){
        System.out.print("What is the force? ");
        double mass = sc.nextDouble();
        System.out.print("What is the Acceleration? ");
        double acc = sc.nextDouble();
        double force = mass * acc;
        System.out.print("Your force is: " + force);

    }
    public void gravetyForce(){
        System.out.print("What is the mass of the 1st object? ");
        double mass1 = sc.nextDouble();
        System.out.print("What is the mass of the 1nd object? ");
        double mass2 = sc.nextDouble();
        System.out.print("What is the distance of the 2 objects? ");
        double D = sc.nextDouble();
        System.out.print("What is the gravitational constant(on earth its 9.8)? ");
        double G = sc.nextDouble();
        double F = (G * mass1 * mass2) / (D*D);
        System.out.print("The gravitational force is: " + F);
    }
    public void escapevelocity(){
        System.out.print("What is the gravitational constant(on earth its 9.8)? ");
        double G = sc.nextDouble();
        System.out.print("What is the mass of the object that you are trying to leave? ");
        double M = sc.nextDouble();
        System.out.print("How far away are you from its venter? ");
        double R = sc.nextDouble();
        System.out.print("The Velocity that you need is " + (Math.sqrt(2*G*M)/R));

    }
    public void acceleration(){
        System.out.print("What is the change in velocity ? ");
        double V = sc.nextDouble();
        System.out.print("What is the time taken ? ");
        double T = sc.nextDouble();
        System.out.print("Your acceleration is " + (V/T));
    }
    public void pressurediffrenceformula(){
         System.out.print("What is the pressure in the first area? ");
        double V = sc.nextDouble();
        System.out.print("What is the pressure in the second area? ");
        double T = sc.nextDouble();
        System.out.print("Your acceleration is " + (V - T));
    }
}