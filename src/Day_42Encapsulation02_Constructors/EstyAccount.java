package Day_42Encapsulation02_Constructors;

public class EstyAccount {
   private String email;
   private String firstName;
   private String password;
   public void setAccountInfo(String email,String firstName,String password ) {
       this.email = email;
       this.firstName = firstName;
       setPassword(password);

   }

   public String getEmail(){
       return email;
   }
public void setEmail (String email){
       this.email = email;
}
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName (String FirstName) {
        this.firstName = firstName;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword (String Password) {
       if(Password.length()<6){
           System.out.println("Password - Must be at least 6 characters.");
           return;
       }
        this.password = Password;




    }
}
