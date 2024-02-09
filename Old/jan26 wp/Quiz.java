public class Quiz {
    private String email;
    
    public Quiz(String email){
        this.email = email;
    }

    public String getName(){
        return email.substring(0, email.indexOf("@"));
    }
    public int countChar(char letter){
        int count = 0;
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }
    public String toString(){
        return "email: adress " + email;
    }
}
