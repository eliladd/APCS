import java.util.ArrayList;
public class ArrList {
    private ArrayList<Integer> numlist = new ArrayList<Integer>();
    public ArrList(){
        for (int i = 0; i < 10; i++){
            numlist.add((int)(Math.random() * (10 - 1 + 1) + 1));
        }
    }
    public void print(){
        for (int num : numlist){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public int searchLargest(){
        int largest = 0;
        for (int num : numlist){
            if (num > largest){
                largest = num;
            }
        }
        return largest;
    }
    public void searchAndReplace(int num){
        for (int i = 0; i < numlist.size(); i++){
            if (numlist.get(i) == num){
                numlist.set(i, 1000);
            }
        }
    }
    public void searchAndRemove(int num){
        for (int i = 0; i < numlist.size(); i++){
            if (numlist.get(i) == num){
                numlist.remove(i);
                i--;
            }
        }
    }
    public void scramble(){
        int temp, j;
        for (int i = 0; i<numlist.size(); i++) {
            j = (int)(Math.random()*numlist.size());
            temp = numlist.get(j); 
            numlist.set(j, numlist.get(i));
            numlist.set(i, temp);
        }

    }
}
