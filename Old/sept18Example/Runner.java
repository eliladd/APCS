public class Runner{
	public static void main(String[] args){
		//(1) What is the difference between the two constructors? ONE HAS VARIABLES PASSED IN, 
        
		Overloaded p1 = new Overloaded();
		Overloaded p2 = new Overloaded(16, "John");
		
		//(2) What is the difference between the outputs of p1 and p2? why?
		p1.print();
		p2.print();
		System.out.println();
		
		//(3) What is the difference between the outputs of p1.print() and p1.print(5)? why?
		p1.print(5);
		System.out.println();
		
		//(4) What is the difference between the outputs of p1.print(5) and 
		//    p1.print("Henry")? why?
		p1.print(5);
		p1.print("Henry");
	}
}