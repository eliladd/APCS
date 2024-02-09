import java.util.ArrayList;
public class ArrayListRef {
    public void printArray(ArrayList<Integer> array){
        for (int element : array){
            System.out.print(element + " "); 
        }
        System.out.println();
    }
    public void scramble(ArrayList<Integer> array){
        int temp, j;
        for (int i = 0; i<array.size(); i++) {
            j = (int)(Math.random()*array.size());
            temp = array.get(j); 
            array.set(j, array.get(i));
            array.set(i, temp);
        }

    }
}
