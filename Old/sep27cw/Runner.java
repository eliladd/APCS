
public class Runner {
    public static void main(String[] args){
        MathLibrary ML = new MathLibrary();
        ML.volCylinder(10, 15);
        ML.volSphere(10) ;
        ML.solvePythag(5, 12); 
        ML.checkOddOrEven(-6);
        ML.checkOddOrEven(11);
        ML.solveQuadratic(1, 2, 2) ;
        ML.solveQuadratic(1, 2, -3) ;


    }
}
