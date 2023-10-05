public class Profile {
    private String name;
    private int age;
    public Profile(){
        name = "John";
        age = 15;
    }
    public Profile(String aName, int aInt){
        name = aName;
        age = aInt;
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(age+"\n");
    }
    public void printInfo(int aId){
        System.out.println("ID#: " + aId);
        printInfo();
    }
}
