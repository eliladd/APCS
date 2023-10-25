public class Quiz5 {
    //takes in a number and prints every number subtracted by 3 inclusive
    public void countDownBy3(int aNum){

        int num = aNum;
        while (num-3 >=0 ){
            //prints number
            System.out.print(num + " ");
            //subtracts it by 3
            num -= 3;
            
        }
        //catches the 0
        System.out.print(num + " ");

    }
    //takes a number and adds all the numbers below and equal to it(inclusive)  8 = (8,7,6,5,4,3,2,1). returns value of all of them added
    public int getSummation(int aNum){
        int total = 0;
        int num = aNum;
        do{
            //starts from largest number and adds it to total
            total += num;
            //counts passed in num down
            num--;
        } while(num > 0);
        return total;
    }
}
