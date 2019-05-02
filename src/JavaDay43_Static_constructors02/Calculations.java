package JavaDay43_Static_constructors02;

public class Calculations {
    public static void main(String[] args) {
        System.out.println(Calculator.plus(5,3));
        System.out.println(Calculator.minus(50,3));


        Calculator heyCalculator = new Calculator();
        System.out.println(heyCalculator.multiply(5,3));
        System.out.println(heyCalculator.plus(10,30));
        System.out.println(heyCalculator.minus(10,5));

        heyCalculator.operation = "math calculations";


    }

}
