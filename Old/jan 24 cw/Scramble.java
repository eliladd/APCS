public class Scramble {
    public void printArray(int[] aray){
        for(int var : aray){
            System.out.print(var + " ");
        }
        System.out.println();
    }
    public void printArray(String[] aray){
        for(String var : aray){
            System.out.print(var + " ");
        }
        System.out.println();
    }
    public int search(int num, int[] aray){
        for(int i = 0; i < aray.length - 1; i++){
            if (aray[i] == num){
                return i;
            }
        }
        return -1;
    }
    public void scramble(int[] nums){
        for(int i=0; i < nums.length; i++ ){
            //choose a random index for the swap
               int j = (int)(Math.random()*nums.length);
    
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
       }
    }
    public void scramble(String[] nums){
        for(int i=0; i < nums.length; i++ ){
            //choose a random index for the swap
               int j = (int)(Math.random()*nums.length);
    
            String temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
       }
    }
    

}
