public class Array2DString {
    public void printStr(String[][] arr){
        for(int row=0; row<arr.length; row++){
            for(int column=0; column<arr[row].length; column++){
                System.out.print(arr[row][column]+"\t");
            }
            System.out.println();
        }
    }
    public boolean findAnimal(String[][] arr, String animal){
        for(int row=0; row<arr.length; row++){
            for(int column=0; column<arr[row].length; column++){
                if(arr[row][column].equals(animal)){
                    return true;
                }
            }
        }
        return false;
    }
}
