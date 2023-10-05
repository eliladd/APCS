package Old.Quiz3;
public class Runner{
    public static void main(String[] args){
        //Instantiate methodquiz
        MethodQuiz mthq1 = new MethodQuiz();
        //should return 0 b/c instance vaaribles are 0
        mthq1.printSurfaceArea();
        //set variables
        mthq1.setvariables();
        //print SA and VOL  
        mthq1.printSurfaceArea();
        mthq1.printVolume();

    }
}

