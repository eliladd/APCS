public class ForTest {
    public void printNums(int aNum1, int aNum2){
        for (int i = 1; i<=aNum2; i++){
            System.out.println(i);
        }
    }
    public int getFactorial(int aNum1){
        int num = 1;
        for (int i = aNum1; i>0; i--){
            num *= i;
        }
        return num;
    }
}
