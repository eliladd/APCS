public class Runner {
    public static void main(String[] args){
        Quiz q1 = new Quiz("tom.johnson@mvla.net");
        String name = q1.getName();
        System.out.println("The name is " + name);
        int count = q1.countChar('t');
        System.out.println("The count is " + count);
        System.out.println(q1);
    }
}
