public class StringSwap {
    
    private String[] word;

    public StringSwap(){
        word = new String[5]; 
        word[0] = "cat";
        word[1] = "dog";
        word[2] = "mouse";
        word[3] = "bird";
        word[4] = "aardvark";
    }
    public void printWords(){
        for(String var : word){
            System.out.print(var + " ");
        }
        System.out.println();
    }
    public void swapWords(int num1, int num2){
        if ( num1 > 5 || num2 > 5){
            System.out.println("out of bounds");
        }
        else{
            String swap = word[num1];
            word[num1] = word[num2];
            word[num2] = swap;
        }
    }
}

