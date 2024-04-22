class Dog{
    private String name;
    public Dog(String name){
        this.name = name;
    }
    public String speak(){
        return "woof";
    }
}
class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }
    @Override
    public String speak(){
        return super.speak() + "!!!!";
    }
}
class Huskey extends BigDog{
    public Huskey(String name){
        super(name);
    }
    @Override
    public String speak(){
        return super.speak() + "+ howl!!!";
    }
}
class SmallDog extends Dog{
    public SmallDog(String name){
        super(name);
    }
    @Override
    public String speak(){
        return super.speak() + "...";
    }
}
public class DogRunner {
    public static void main(String[] args){

        Dog d1 = new Dog("Fido");
        System.out.println(d1.speak());
        BigDog d2 = (BigDog) d1;
        BigDog bd1 = new BigDog("biggie");
        System.out.println(bd1.speak());
        Dog bd2 = (Dog) bd1;
        System.out.println(bd2.speak());
        Huskey h1 = new Huskey("snow");
        System.out.println(h1.speak());
        Dog h2 = (Dog) h1;
        System.out.println(h2.speak());
        Huskey h3 = (Huskey) h2;
        System.out.println(h3.speak());
        BigDog h4 = (BigDog) h1;
        SmallDog sm = new SmallDog("tiny");
        System.out.println(sm.speak());
        Dog d3 = (Dog) sm;
        System.out.println(d3.speak());
        //BigDog bd3 = (BigDog) sm;

    }
}
