public class NestedLoops {
  //Method to draw a 5 x 5 box
  public void drawFilledBox(){
    //Outer loop to shift rows
    for(int i = 1; i <= 5; i++){
      //Inner loop to print each axterix
      for(int o = 1; o <= 5; o++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }
  //Method to draw a box with specific parameters
  public void drawFilledBox(int num1, int num2){
    for (int i = 1; i <= num2; i++){
      for(int o = 1; o <= num1; o++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }
  //create a multiplication table
  public void drawMultiChart(){
    //the number that will be the basis of each line
    int num = 1;
    for(int i = 1; i <=9; i++){
        //horizontal lines
        for(int x = 1; x <=9; x++){
            System.out.print(num*x + "\t");
        }
        //next horizontal line
        System.out.println();
        System.out.println();
        num++;
    }
  }
  //Method to draw triangle with specific height parameter
  public void drawTriangle(int num1){
    //Creating width for the triangle
    int width = 1;
    //Outer loop for rows
    for(int i = 1; i <= num1; i++){
      //Inner loop for individual asterixes
      for(int o = 1; o <= width; o++){
        System.out.print("*");
      }
      width++;
      System.out.println("");
    }
  }
}
