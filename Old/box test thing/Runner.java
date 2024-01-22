import box.*;
/* or
import box.StandardBox;
import box.ShippingBox;
*/

public class Runner{
	public static void main (String[] args){
		
		ShippingBox obj = new ShippingBox();
		obj.printInfo();
		
				
		System.out.println("\nRunning inside Runner: ");
		
		
		StandardBox obj2 = new StandardBox();
		
		//Uncomment the code and answer. 
		
		//(5) Does it print? Why or why not? yes, because it is public
		System.out.println( obj2.companyName );
		
		//(6) Does it print? Why or why not? no, becuase it is private
		//System.out.println( obj2.password );
		
		//(7) Does it print? Why or why not? no, becasue it is protected
		//System.out.println( obj2.streetAddress );
		
		//(8) Does it print? Why or why not? no, it is default, so it cannot be acsessed outside of the package
		//System.out.println(obj2.city);	
	}
}