public class SkyView 
{ 
 /** A rectangular array that holds the data representing a rectangular area of the sky. */ 
 private double[][] view; 
 
 /** Constructs a SkyView object from a 1-dimensional array of scan data. 
 * @param numRows the number of rows represented in the view 
 * Precondition: numRows > 0 
 * @param numCols the number of columns represented in the view 
 * Precondition: numCols > 0 
 * @param scanned the scan data received from the telescope, stored in telescope order 
 * Precondition: scanned.length == numRows * numCols 
 * Postcondition: view has been created as a rectangular 2-dimensional array 
 * with numRows rows and numCols columns and the values in 
 * scanned have been copied to view and are ordered as 
 * in the original rectangular area of sky. 
 */ 
 public SkyView(int numRows, int numCols, double[] scanned) 
 { /* to be implemented in part (a) */ 
    int count = 0;
 	double[][] view = new double[numRows][numCols];
    for(int i = 0;i<=numRows;i++){
        if (i%2 == 1){
            for(int x = 0;x<=numCols-1; x++){
                view[i][x] = scanned[count];
            }
        }
        else{
            for(int x = numCols;x<=0; x--){
                view[i][x] = scanned[count];
            }
        }
        count++;
    }
 	
 } 
 
 /** Returns the average of the values in a rectangular section of view. 
 * @param startRow the first row index of the section 
 * @param endRow the last row index of the section 
 * @param startCol the first column index of the section 
 * @param endCol the last column index of the section 
 * Precondition: 0 <= startRow <= endRow < view.length 
 * Precondition: 0 <= startCol <= endCol < view[0].length 
 * @return the average of the values in the specified section of view 
 */ 
 public double getAverage(int startRow, int endRow, int startCol, int endCol) 
 { /* to be implemented in part (b) */ 
    int average = 0, count = 0;
    for(int i = startRow; i<=endRow; i++){
        for(int x = startCol; x<=endCol; x++){
            average += view[i][x];
            count++;
        }
        
    }
return (average/count);
}
 // There may be instance variables, constructors, and methods that are not shown. 
 
 public void printSky()
 {
 	for(int r=0; r < view.length; r++)
 	{
 		for(int c=0; c < view[r].length; c++)
 		{
 			System.out.print(view[r][c] + "\t");
 		}
 		System.out.println();
 	}
 }
} 