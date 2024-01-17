public class ArrayTest {
    private int[] numarray;
    private String[] stringArray;

    public ArrayTest(){
        numarray = new int[20];
        stringArray = new String[5];
        for (int i = 0; i < numarray.length; i++){
            numarray[i] = (int)(Math.random() * (20 - 1 + 1) + 1);
        }
        stringArray[0] = "cat";
        stringArray[1] = "dog";
        stringArray[2] = "bird";
        stringArray[3] = "whale";
        stringArray[4] = "snake";

    }
    public void printNumArray(){
        for (int var : numarray){ 
            System.out.print(var + " ");;
        }
        System.out.println();
    }
    public void printStringArray(){
        for (String var : stringArray){ 
            System.out.print(var + " ");;
        }
        System.out.println();
    }
    public void swapNumArray(int num1, int num2){
        int temp = numarray[num1];
        numarray[num1] = numarray[num2];
        numarray[num2] = temp;
    } 
    public void swapStringArray(int num1, int num2){
        String temp = stringArray[num1];
        stringArray[num1] = stringArray[num2];
        stringArray[num2] = temp;
    } 
    public int searchString(String thing){
            for (int i = 0; i < stringArray.length; i++){
                if (stringArray[i].equals("thing")){
                    return i;
                }
            }
            return -1;
        }
}
