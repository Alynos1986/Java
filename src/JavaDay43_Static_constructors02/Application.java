package JavaDay43_Static_constructors02;

public class Application {
    public static void main(String[] args) {
        AppUser user1 = new AppUser("ironman", "Mark Smith", "ac124");
        AppUser user2 = new AppUser("postman", "Alin alin", "biwidb");
        AppUser user3 = new AppUser("superman", "HI JOe", "soefhw");

        user1.setCount(100);

        System.out.println(user1.getCount());
        System.out.println(user2.getCount());
        System.out.println(user3.getCount());

        AppUser user4 = new AppUser();
        System.out.println(user4.getCount());
        System.out.println(user1.getUserID());
        System.out.println(user2.getUserID());
    }
}
