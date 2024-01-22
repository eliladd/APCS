public class Runner {
    public static void main(String[] args){
        String word = "abracadabra";
        System.out.println("String: " + word);
        System.out.println("legnth: " + word.length());
        System.out.println("index of 'a': " + word.indexOf('a'));
        System.out.println("index of 'a' past index 6: " + word.indexOf('a', 6));
        char ind = word.charAt(6);
        System.out.println("charticter at index 6: " + ind);
    }
}
