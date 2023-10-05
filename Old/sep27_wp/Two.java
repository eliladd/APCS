public class Two {
    private String name;
    public Two(){
        name = "none";
    }
    public Two(String aName){
        name = aName;
    }
    public void printName(){
        System.out.println(name);
    }
    public void printName(int aAge){

        printName();
        System.out.println("your age is " + aAge);
    }
}
