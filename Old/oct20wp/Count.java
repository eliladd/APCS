public class Count {
    int value;
    Count(int aValue){
        value = aValue;
    }
    public int getSum(int step){
        int finalNum=0, counter;
        counter = step;
        while ( counter <= value){
            finalNum += counter;
            counter += step;
        }
        return finalNum;
        
    }
}
