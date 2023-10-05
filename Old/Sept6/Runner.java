
public class Runner{
	public static void main(String[] args){
		//(1) Where is Chicken coming from?
		Chicken chicken = new Chicken();
        Turkey turkey;
        turkey = new Turkey();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		//(2) What is the significance of the variable chicken?
		//(3) Where is speak() coming from and what does it do?
		chicken.speak();
		chicken.speak();
		chicken.speak(); 
        turkey.speak();
        turkey.printName();
		cat.speak();
		cat.sayName();
		dog.speak();
 	}
}
