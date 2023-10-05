
public class MathLibrary {
    public void volCylinder(double aRad, double aHeight){
        double vol = Math.PI * aRad * aRad * aHeight;
        System.out.println("volCylinder: " + vol);
    }

    public void volSphere(double aRad){
        double vol = (4.0/3.0) * Math.PI * Math.pow(aRad, 3);
        System.out.println("volSphere: " + vol);
    }

    public void checkOddOrEven(int aNum){
        int num = aNum % 2;
        if (num == 0){
            System.out.println("Even!");
        }
        else{
            System.out.println("Odd!");
        }
    }

    public void solveQuadratic(int aA, int aB, int aC){
        double a = aA;
        double b = aB;
        double c = aC;
        double pos = (((-1)*b)+Math.sqrt((Math.pow(b,2))-(4*a*c))) / (2*a);
        double neg = (((-1)*b)-Math.sqrt((Math.pow(b,2))-(4*a*c))) / (2*a);
        System.out.println("the answers are: ");
        System.out.println(pos);
        System.out.println("and");
        System.out.println(neg);
    }
    public void solvePythag(int aA, int aB){
        double c = Math.sqrt(Math.pow(aA,2) + Math.pow(aB, 2));
        System.out.println("solvePythag: " + c);
    }
}
