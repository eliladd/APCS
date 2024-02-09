public class BubbleSort {
    public void printArray(int[] aray){
        for(int var : aray){
            System.out.print(var + " ");
        }
        System.out.println();
    }
    public void BubbleSort(int[] nums){
        //Array is traversed nums.length-1 times
    for(int i=0; i < nums.length-1; i++ ){
	    // Array is traversed from index 0 through index nums.length-i-1
        for(int j=0; j < nums.length-i-1; j++){
        //If item at j is greater than j+1,then swap
            if( nums[j] > nums[j+1] ){
                //swap
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
    }  

}
}
