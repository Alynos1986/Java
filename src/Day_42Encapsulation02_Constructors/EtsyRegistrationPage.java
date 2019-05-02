package Day_42Encapsulation02_Constructors;

public class EtsyRegistrationPage {
    public static void main(String[] args) {
        EstyAccount account1 = new EstyAccount();
        account1.setEmail("account1@gmail.com");
        account1.setFirstName("Alin");
        account1.setPassword("Chicago1234");
        System.out.println("Account 1 email: " + account1.getEmail());

        EstyAccount account2 = new EstyAccount();
        account2.setEmail("account2@gmail.com");
        account2.setFirstName("Marcel");
        account2.setPassword("Florin404");

        EstyAccount account3 = new EstyAccount();
        account3.setEmail("account3@gmail.com");
        account3.setFirstName("_");
        account3.setPassword("123");

        //use getters to get data

        System.out.println("First name of account1 : " + account1.getFirstName());



    }
}





