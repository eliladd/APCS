public class ForPractice {
    public void printEven(int aNum){
        int num = aNum;
        for (int i = 1; i <num; i++){
            if ((i%2)!=0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
    public int findNum(int aLowerNum, int aHigherNum, int aDivisableByNum){
        int LowerNum = aLowerNum, HigherNum = aHigherNum, DivisableByNum = aDivisableByNum, num = 0;
        for (int i = LowerNum; i < HigherNum; i++){
            num = -1;
            if (i%DivisableByNum==0){
                num = i;
                break;
            }
        }
        return num;

    }
}
