public class StringSwap {
    
    private int[] arr;

    public StringSwap(){

        int [] arr = {10, 20, 30, 40, 50};

        for(int x = 1; x < arr.length - 1; x++){
            arr[x + 1] = arr[x] + arr[x + 1];
        }
    }
    public void printWords(){
        for(int var : arr){
            System.out.print(var + " ");
        }
        System.out.println();
    }
    
}

