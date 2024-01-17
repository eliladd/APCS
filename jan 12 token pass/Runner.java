/* Use this class to test your TokenPass code */
public class Runner
{
	public static void main(String args[])
	{
		System.out.println("Part A");
		TokenPass tp = new TokenPass(4);
		tp.printInfo();
		
		System.out.println("\nPart B");
        /* Hard-code the board array so that you can test against
         * the results in the FRQ description. */
		tp.partBTest();
		System.out.println("Before:");
		tp.printInfo();
		
		System.out.println("\nDistribute tokens from player 1\n");
		
		System.out.println("After:");
		tp.distributeCurrentPlayerTokens();
		tp.printInfo();
	}
}