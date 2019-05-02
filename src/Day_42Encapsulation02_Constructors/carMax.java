package Day_42Encapsulation02_Constructors;

public class carMax {
    public static void main(String[] args) {
        car carone = new car();
carone.setMake("Acura");
carone.setModel("ILX");
carone.setType("sedan");
carone.setSpeed(35);

        System.out.println("Make:" + carone.getMake());
        System.out.println("Current speed: " + carone.getSpeed());

carone.accelerate(30);
        System.out.println("Current speed: " + carone.getSpeed());
    }
}
