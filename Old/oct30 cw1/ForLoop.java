// Replace each question with a comment that describes what the code is doing.
public class ForLoop{
	public void test1(){
		//1) Prints 0, and then adds one untill it reaches 10, non inclusive
		System.out.println("\n\nTest1");
		for(int i=0; i < 10; i++){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test2(){
		//2) prints 15, then decrases it by 1 untill it reaches 2(non inclusive)
		System.out.println("\n\nTest2");
		for(int i=15; i > 2; i--){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test3(int max){
		//3) we pass in 50, and we count up from 0 to 50 by 5(inclusive)
		System.out.println("\n\nTest3");
		for(int i=0; i <= max; i+=5){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test4(int min, int max){
		//4) we pass in 5 and 10, and count down by 2 starting from 10, and untill we reach 5(non inclusive)
		System.out.println("\n\nTest4");
		for(int i=max; i > min; i-=2){
			System.out.print(i + " ");
		}
	System.out.println();
	}
	
	//5) When does it make sense to use a for loop instead of a while loop?
    //you should use a for loop when you have a loop that terminates by itself when you reach a condition, and a loop that can change the condition state

}
