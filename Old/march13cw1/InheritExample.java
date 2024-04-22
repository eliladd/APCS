// www.apluscompsci.com

//Inheritance example: 
// Because the classes are so small, they are all in one file.
// This code will run from the class with the main method.
// Run the code and answer the questions.



class Monster
{
	// 1. Can the Witch class access myName? YES
	private String myName;

	// Default constructor
	public Monster()
	{
		myName = "Monster";
	}

	// Constructor that receives a name
	public Monster( String name )
	{
		myName = name;
	}

	public void speak() {
		System.out.println("ROOOOOAAAAARRRRR\n");
	}

	public String toString()
	{
		return "Monster name :: " + myName;
	}
}
//----------------------------------------------------
class Witch extends Monster{	
	public Witch() {
		super("Witch");
	}

	
	@Override
	public void speak() {
		System.out.println("CACKLE CACKLE\n");
	}
	
	
}



//-----------------------------------------------
public class InheritExample
{
  public static void main ( String[] args )
  {
	// 2. Which Monster constructor will be invoked? It will be the one actually named Monster
     Monster m = new Monster(); 

	 //3. What code is used to print m? It will be the one actually named Monster
     System.out.println(m);
	 m.speak();

	 //4. What happens when the Witch() default constructor is called? it will call witch, but it has the same code as monster
     Witch witch = new Witch();

	 //5. What code is used to print witch? I think it will print the witch, but it has the same code as monster
     System.out.println(witch);

	 //6. What code is used to make the witch speak? the witch will speak, but it has the same code as monster
	 witch.speak();
     
     //7. Add a default constructor to the Witch class. add 
	 //   the statement super("Witch").
	 //8. Override the Monster speak() method with a speak method for Witch.
	 //   Make a witch say "CACKLE CACKLE"
	 //9. Run your code and submit the output with the answers to 
	 //   the 6 questions.
     
  }
}