public class ArrayTest {
    private int[] numbers;
    public ArrayTest(int aNum){
        numbers  = new int[aNum];
        for (int i=0; i<aNum;i++){
            //System.out.println("x");
            numbers[i] = (int)Math.floor(Math.random() * (9 - 1 + 1) + 1);
        }
    }
    public void print(){
        for (int  each  :  numbers){
            System.out.println(each + " ");
        }
    }
    public int getSmallest(){
        int num = numbers[0];
        for (int  each  :  numbers){
            if (each < num){
                num = each;
            }
        }
        return num;
    }
}
