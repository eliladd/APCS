class Runner {

	public static void main(String args[]) {
		//instantinatiing multiple Animal classes
		Animal animal1 = new Animal();
		//these ones use multi threading to run diffrent classes based on number and tyoes of inputs
		Animal animal2 = new Animal("cat", 7);
		Animal animal3 = new Animal("goat", 2);
		Animal animal4 = new Animal("goat", 2, "charels");
		
		//prints and sets information for animals classes to run
		animal1.printInfo();
		animal2.setName("Roco");
		animal2.printInfo();
		animal3.setName("Fluffy");
		animal3.printInfo();
		animal4.printInfo();
		animal4.setName("Fluffy");
		animal4.printInfo();
	}
}
