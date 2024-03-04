class TwoDExampleRunner {

	public static void main(String[] args) {
		// initialize a 2D Array.
		int[][]numArr = {{6, 5, 7, 9, 2}, {5, 3, 4, 6}, {7, 0, 8}};  
		
		// Print the elements in the 2D array
		for( int[] row : numArr ){  
			for( int num : row ) {
				System.out.print(num + " ");
			}
		System.out.println();
		}
		//print using a regular for loop
		for (int row=0; row<numArr.length; row++) {
			for (int col=0; col<numArr[row].length; col++) {
				System.out.print(numArr[row][col] + " ");
			}
			System.out.println();
		}
		
		for (int row=0; row<numArr.length; row++) {
			System.out.println("length of row " + row +": " + numArr[row].length);
		}	
		

	}
}