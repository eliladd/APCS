public class ForEach {
    public void printArray(int[] aArray){
        for (int  each  :  aArray){
            System.out.print(each + " ");
        }
    }
    public void printArray(String[] aArray){
        for (String  each  :  aArray){
            System.out.println(each + " ");
        }
    }
    public boolean search(String aString, String[] aArray){
        for(String  each  :  aArray){
            if (each.equals(aString)) {
                return true;
            }
        }
       return false;
    }
    public boolean search(int aString, int[] aArray){
        //
        for(int  each  :  aArray){
            //System.out.println(aArray[each]);
            if (aString == each) {
                return true;
            }
        }
       return false;
    }
    public int findLargest(int[] aArray){
        int num = -9999999;
        for(int  each  :  aArray){
            if (each > num) {
                num = each;
            }
        }
        return num;
    }
}
