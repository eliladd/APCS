public class Runner {
    public static void main(String[] args){
        BubbleSort b1 = new BubbleSort();
        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*25 + 1);
        }
        b1.printArray(nums);
        b1.BubbleSort(nums);
        b1.printArray(nums);
    }
}
