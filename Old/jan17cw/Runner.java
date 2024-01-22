public class Runner {
    public static void main(String[] args){
        Split sp = new Split("joe.shmo@gmail.com");
        sp.print();
        System.out.println(sp.getName());
        System.out.println(sp.getDomain());
        System.out.println(sp.getLastName("lisa.simpson@mvla.net"));
        System.out.println(sp);
    }
}
