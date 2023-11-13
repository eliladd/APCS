public class ArrayTest {
    private int[] numarr;
    public ArrayTest(int aNumLength){
        numarr = new int[aNumLength];
        for (int i=0; i<aNumLength;i++){
            //System.out.println("x");
            numarr[i] = (int)Math.floor(Math.random() * 5+1);
        }
    }
    public void print(){
        for (int i = 0; i<numarr.length;i++){
            System.out.print(numarr[i] + " ");
        }
    }
    public int getSum(){
        int num = 0;
        for (int i = 0; i<numarr.length;i++){
            num += numarr[i];
        }
        return num;
    }
}