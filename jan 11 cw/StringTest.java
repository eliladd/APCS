public class StringTest {
    private String myText ;
    public StringTest(String myText){
        this.myText = myText;
    }
    private int getLength(){
        return myText.length();
    }
    public void printInfo(){
        System.out.println(myText);
        System.out.println(myText);
    }
    public void printChar(int num){
        System.out.println(myText.charAt(num));
    }
    public void printLocation(String thing){
        System.out.println(myText.indexOf(thing));
    }
    public int countChar(char letter){
        int count = 0;
        for (int i = 0; i < getLength(); i++){
            if (myText.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }
}
