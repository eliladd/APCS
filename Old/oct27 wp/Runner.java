public class Runner {
    public static void main(String[] args){
       Test atest = new Test(2,2); 
       System.out.println(atest.check1());
       atest.check2(2);
       Test btest = new Test(7,7); 
       System.out.println(btest.check1());
       btest.check2(7);


    }
}
