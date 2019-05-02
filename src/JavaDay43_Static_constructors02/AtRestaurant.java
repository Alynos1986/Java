package JavaDay43_Static_constructors02;

public class AtRestaurant {
    public static void main(String[] args) {
        dinner Dad  = new dinner();
        dinner MOm = new dinner();
        dinner Kid = new dinner();

        System.out.println("Pizza slices: " + Dad.pizzaSlices);
        Dad.takeASlice(2);
        Kid.takeASlice(3);
        MOm.takeASlice();

        System.out.println("Pizza slices: " + MOm.pizzaSlices);
        MOm.takeASlice();
        System.out.println(Kid.pizzaSlices);

    }
}
