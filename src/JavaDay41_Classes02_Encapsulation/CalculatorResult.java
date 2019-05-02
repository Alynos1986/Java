package JavaDay41_Classes02_Encapsulation;

public class CalculatorResult {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc. setA(100);
        System.out.println(calc.getA());

        calc.setB(50);
        System.out.println(calc.getB());

        calc.setResult(150);
        System.out.println(calc.getResult());
    }
}
