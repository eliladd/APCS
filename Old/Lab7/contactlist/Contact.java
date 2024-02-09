package contactlist;
public class Contact{
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String domainName;
    private String domainExt;
    private Boolean show;
    public Contact(String firstName, String lastName, String email){
        String emailData = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

        username = emailData.substring(0, emailData.indexOf("@") );
        emailData = emailData.substring(emailData.indexOf("@")+1);

        domainName = emailData.substring(0, emailData.indexOf("."));
        emailData = emailData.substring(emailData.indexOf(".")+1);

        domainExt = emailData;

        show = true;
    }
    public String toString(){
        return firstName + " " + lastName + " " + email;
    }
    protected String getFirstName(){
        return firstName.toLowerCase();
    }
    protected String getLastName(){
        return lastName.toLowerCase();
    }
    protected String getUsername(){
        return username.toLowerCase();
    }
    protected String getDomainName(){
        return domainName.toLowerCase();
        }
    protected String getDomainExtension(){
        return domainExt.toLowerCase();
    }
    protected Boolean isVisable(){
        return show;
    }
    protected void show(){
        show = true;
    }
    protected void hide(){
        show = false;
    }

}
