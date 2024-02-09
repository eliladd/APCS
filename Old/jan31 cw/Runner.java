import  java.util.ArrayList;   // Don't forget to import the ArrayList class
import java.util.Scanner;

public class Runner{
	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		
		ArrayList<Song> songList1 = new ArrayList<Song>();
		System.out.print("What does the code ArrayList<Song> songList1 = new ArrayList<Song>() do?\n\t");
		scan.nextLine();
		System.out.println();

		System.out.print("What is the size of songList1?\n\t");
		scan.nextLine();
		System.out.println();
		
		songList1.add(new Song("John", "New Wave Crave"));
		songList1.add(new Song("Jose", "Love the Beat"));
		System.out.print("What did the add() method do?\n\t");
		scan.nextLine();
		System.out.println();

		System.out.println( "1) " +songList1.get(0).getSongName() );
		System.out.println( "2) " +songList1.get(1).getSongName() );
		System.out.print("What did the calls to get() do? \n\t");
		scan.nextLine();
		System.out.println();

		System.out.println( "3)" +songList1.get(0) );
		System.out.println( "4) "+songList1.get(1) );
		System.out.print("Why is the result of the number 3 and 4 calls to get() different from the result of the number 1 and 2 calls?\n\t");
		scan.nextLine();
		System.out.println();

		System.out.println("ArrayList size: " + songList1.size());
		
		System.out.println();
		songList1.add(0, new Song("Cal", "Country Time"));
		songList1.set(1, new Song("Jen", "Rock on") );
		System.out.print("What is the difference between add() and set()?\n\t");
		scan.nextLine();
		System.out.println();

		System.out.println( songList1.get(0) );
		System.out.println(songList1.get(1));
		System.out.print("Which toString() method was invoked to print songList1.get(1) and why?\n\t");
		scan.nextLine();
		System.out.println();

		System.out.println(songList1);
		System.out.print("Which toString() method was invoked to print songList1 and why?\n\t");
		scan.nextLine();
		System.out.println();

		songList1.clear();
		System.out.print("What does clear() do?\n\t");
		scan.nextLine();
		System.out.println();

		System.out.println("ArrayList size: " + songList1.size());
	}
}
