class Animal{
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public void speak(){
        System.out.println("Hello my name is ");
    }
    public String getName(){
        return name;
    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void speak(){
        System.out.println("Woof");
    }
    public void printInfo(){
        super.speak();
        System.out.println(getName());
        System.out.print("I can make this noise:");
        this.speak();
    }
}
class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    @Override
    public void speak(){
        System.out.println("Tweet");
    }
    public void printInfo(){
        super.speak();
        System.out.println(getName());
        System.out.print("I can make this noise:");
        this.speak();
    }
}
public class Runner {
    public static void main(String[] args){
        Dog dog = new Dog("Fido");
        Bird bird = new Bird("Tweety");
        dog.printInfo();
        bird.printInfo();
    }
}
