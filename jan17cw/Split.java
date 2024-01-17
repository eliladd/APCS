public class Split {
    private String email;
    public Split(String email){
        this.email = email;
    }
    public void print(){
        System.out.println(email);
    }
    public String getName(){
        return email.substring(0, email.indexOf('@'));
    }
    public String getDomain(){
        return email.substring(email.indexOf('@')+1, email.length());
    }
    public String getLastName(String email){
        return email.substring(email.indexOf('.')+1, email.indexOf('@'));
    }
    public String toString(){
        return "address: " + email;
    }

}
