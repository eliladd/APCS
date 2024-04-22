import java.util.ArrayList;

public class PetRunner {
    public static void main(String[] args) {
        // create a Kennel Object
        Kennel kObj = new Kennel();
        kObj.allSpeak();
    }
}

//---------------------------------------------------------------
    // Pet Class
    abstract class Pet {
        private String myName;
        
        // constructor
        public Pet(String name) {
            myName = name;
        }

             // return the name
        public String getName() {
            return myName;
        }
        
        public abstract String speak();
        
    }

//----------------------------------------------------------------

    // Dog class
    class Dog extends Pet {

        // constructor
        public Dog(String name) {
            super(name);
        }

        // speak method
        @Override
        public String speak() {
            return("WOOF");
        }
    }

// ------------------------------------------------------

    /* a) Given the class hierarchy shown above, write a complete class declaration for the class Cat, 
    including implementations of its constructor and method(s). 
    The Cat method speak returns "meow" when it is invoked. */
    class Cat extends Pet {

        // constructor
        public Cat(String name) {
            super(name);
        }

        // speak method
        @Override
        public String speak() {
            return("meow");
        }
    }
// --------------------------------------------------------
    /* b) Given the class hierarchy shown previously, write a 
    complete class declaration for the class LoudDog, including 
    implementations of its constructor and method(s). */
    class LoudDog extends Dog {

        // constructor
        public LoudDog(String name) {
            super(name);
        }

        // speak method
        @Override
        public String speak() {
            return(super.speak() + " " + super.speak());
        }
    }

// -----------------------------------------------------------
    /* c) Implement method allSpeak() */
    // Kennel class
    class Kennel {
        private ArrayList<Pet> petList;

        public Kennel() {
            petList = new ArrayList<Pet>();
            petList.add(new Cat("Princess"));
            petList.add(new Dog("Fido"));
            petList.add(new LoudDog("Rufus"));

        }

        /* For each Pet in the kennel, allSpeak prints a line with the 
        name of the Pet followed by the result of a call to its speak 
        method. */
        public void allSpeak() {
            for(int i = 0; i<petList.size(); i++){
                System.out.println(petList.get(i).getName() + " says " + petList.get(i).speak());
            }
        }
    }

