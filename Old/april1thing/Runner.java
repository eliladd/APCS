public class Runner {
    public static void main(String[] args) {
        run r = new run();
        System.out.println(r.run3(2));
    }
}

class run{
    public int run3(int x) {
        if( x < 5 ){
             x = x + run3(x+1);
             return x;
        } 
        else {
            return x;
        }
    }
}