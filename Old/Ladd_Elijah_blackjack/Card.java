package Old.Ladd_Elijah_blackjack;
public class Card {

   private int value;
   private String name;
   private String suit;

   public Card(String suit, String name, int value){
		this.value = value;
		this.name = name;
		this.suit = suit;
	 }

	public int getValue(){
      return this.value;
   }
   public int getRank(){
      return this.value;
   }
   public String getName(){
      return this.name;
   }
   public String getSuit(){
      return this.suit;
   }
   
}