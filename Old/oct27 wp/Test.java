public class Test {
    private int num1, num2;    

    public Test(int aNum1, int aNum2){
        num1 = aNum1;
        num2 = aNum2;
    }
    public String check1(){
        if (num1 == 7 && num2 == 7){
            return "same";
        }
        else{
            return "no luck";
        }
        
    }
    public void check2(int aNum2){
        switch (aNum2){
            case(1):
                System.out.println("1");
                break;
            case(2):
                System.out.println("2");
                break;
            
            default:
                System.out.println("other");
                break;

        }
        
    }
}
