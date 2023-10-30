public class Runner {
    public static void main(String[] args){
        /*
        for(int i=1; i<=25; i++){
            if (i<=24){
                System.out.print(i  + ", ");
            }
            else{
                System.out.print(i);
            }
            
        }
        System.out.println();
        for(int i=25; i>=1; i--){
            if (i>1){
                System.out.print(i  + ", ");
            }
            else{
                System.out.print(i);
            }
            
        }
        System.out.println();
         */
        for (int i = 1; i <= 25; i++) {
            System.out.print(i);
            if (i < 25) {
              System.out.print(", ");
            }
          }
    }
}
