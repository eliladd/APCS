public class ArraySwap {
    private int[] nums;
    public ArraySwap() {
        nums = new int[10];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 100);
        }
    }
    public void print() {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
