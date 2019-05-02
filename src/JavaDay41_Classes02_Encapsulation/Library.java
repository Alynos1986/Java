package JavaDay41_Classes02_Encapsulation;

public class Library {
    public static void main(String[] args) {

            Book book1 = new Book();
            book1. setTitle("Grit");
            System.out.println(book1.getTitle());

            book1.setAuthor("Angela");
            System.out.println(book1.getAuthor());

            book1.setPages(400);
            System.out.println(book1.getPages());
        }
}
