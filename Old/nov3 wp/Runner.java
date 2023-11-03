public class Runner {
    public static void main(String[] args){
        Fortune obj1 = new Fortune();
        System.out.println(obj1.getFortune(10));
        System.out.println(obj1.getFortune(8));
        System.out.println(obj1.getFortune(17));
        obj1.tellFortune(2);
        obj1.tellFortune(5);
        obj1.tellFortune(8);
    }
}
