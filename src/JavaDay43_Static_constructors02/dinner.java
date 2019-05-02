package JavaDay43_Static_constructors02;

public class dinner {
    public static int pizzaSlices = 8;
    public void takeASlice(){
        pizzaSlices--;
    }
    public void takeASlice(int num) {
pizzaSlices -= num;
    }
}
