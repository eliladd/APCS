public class StringTest2 {
    private String word;
    public StringTest2(String word){
        this.word = word;
    }
    private char getFirstLetter(){
        return word.charAt(0);
    }
    private char getLastLetter(){
        return word.charAt(word.length()-1);
    }
    public void printWordGame(){
            System.out.print(getFirstLetter() + " ");

            // Print "*" for each character in between the first and last characters
            for (int i = 1; i < word.length() - 1; i++) {
                System.out.print("* ");
            }

            // Print the last character
            System.out.println(getLastLetter());
    }
}