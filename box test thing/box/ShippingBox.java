package box;

public class ShippingBox{
	public void printInfo(){
		System.out.println("Running inside ShippingBox: ");
		StandardBox b = new StandardBox();
		
		//Uncomment the code and answer. 
		
		//(1) Does companyName print? Why or why not? yes, because companyName is public
		System.out.println( b.companyName );
		
		//(2) Does password print? Why or why not? no, because password is private
		//System.out.println( b.password );
		
		//(3) Does streetAddress print? why or why not? yes, becauses it is protected, and things that are improted together in a package can see eash other
		System.out.println( b.streetAddress );
		
		//(4) Does city print? Why or why not? yes, becausse the defult modifyer allows the class and package to be visable
		System.out.println(b.city);
	}
}