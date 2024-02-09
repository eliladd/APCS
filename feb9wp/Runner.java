import java.util.ArrayList;

public class Runner {
    public static void main(String[] args){
        ArrayList<Integer> intList = new ArrayList<Integer>();

        ArrayListRef refListObj = new ArrayListRef();

        for(int i = 0; i < 20; i++){
            intList.add((int)((Math.random() * 20) + 1));
        }
        refListObj.printArray(intList);
        refListObj.scramble(intList);
        refListObj.printArray(intList);
    }
}
