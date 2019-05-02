package JavaDay43_Static_constructors02;

public class TVRunner {
    public static void main(String[] args) {
        TV myTV = new TV();
        TV smartTV = new TV("Sharp");
        TV cTV = new TV("HP");

        System.out.println(myTV.isOn());
        System.out.println(myTV.isOn());
        System.out.println(myTV.isOn());

        myTV.turnOn();
        smartTV.turnOn();
        cTV.turnOn();


    }
}
