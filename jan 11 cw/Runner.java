public class Runner {
    public static void main(String[] args){
        StringTest t = new StringTest("The quick brown fox jumps over the lazy dog");
        t.printInfo();
        t.printChar(1);
        t.printChar(5);
        t.printChar(10);
        t.printChar(15);
        t.printLocation("h");
        t.printLocation("e");
        t.printLocation("jumps");
        t.printLocation("dog");
        int count = t.countChar('o');
        System.out.println(count);
    }
}
