public class MyMath {
    public void countdown(int x){
        if(x == 0){
        } else {
            System.out.println(x);
            countdown(x-1);
        }
    }
    //Takes in a number. Counts from 1 to that number recursively.
    public void countUp(int x){
        if(x == 0){
        } else {
            countUp(x-1);
            System.out.println(x);
        }
    }
    public int factorial(int x){
        if (x==1){
            return 1;
        } else {
            return x * factorial(x-1);
        }
    }
    public int summation(int x){
        if (x==1){
            return 1;
        }
        else{
            return x+summation(x-1);
        }
    }
}
