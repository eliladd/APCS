public class Sort {
    private String[] strArray;
    public Sort(){
       strArray = new String[10];
       strArray[0] = "pig";
       strArray[1] = "cow";
       strArray[2] = "horse";
       strArray[3] = "mouse";
       strArray[4] = "moose";
       strArray[5] = "elephant";
       strArray[6] = "dog";
       strArray[7] = "ape";
       strArray[8] = "sheep";
       strArray[9] = "kangaroo";
    }
    public void printArray(){
        for (int i = 0; i <strArray.length;i++){
            System.out.println(strArray[i]);
        }
    }
    public void sortArray(){
        //Array is traversed nums.length-1 times
		for(int i=0; i < strArray.length-1; i++ ){
			// Array is traversed from index 0 through index sArr.length-i-1
			for(int j=0; j < strArray.length-i-1; j++){
				//If item at j is greater than j+1,then swap
				if( strArray[j].compareTo(strArray[j+1]) > 0){
					//swap
					String temp = strArray[j];
					strArray[j] = strArray[j+1];
					strArray[j+1] = temp;
					//System.out.print("   Swapped index " + j + " and " + (int)(j+1) + ": ");
					//printArray();
				}
			}
    

        }
    }
}
