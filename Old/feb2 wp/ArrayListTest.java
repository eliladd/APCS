import java.util.ArrayList; 
public class ArrayListTest {
    private ArrayList<Integer> numlist = new ArrayList<Integer>();
    public ArrayListTest(int size){
        for (int i = 0; i < size; i++){
            numlist.add((int)(Math.random() * (15 - 1 + 1) + 1));
        }
    }
    public void print(){
        for (int num : numlist){
            System.out.print(num + " ");
        }
    }
    public void printbackwards(){
        for (int i = numlist.size() - 1; i >= 0; i--){
            System.out.print(numlist.get(i) + " ");
        }
    }
}
