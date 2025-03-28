public class Exampleofcaluclator {
    public static void main(String[] args) {
        CalculatorOverloading obj = new CalculatorOverloading();
        System.out.println("Addition of two integers 2 and 3: " + obj.add(2, 3));
        System.out.println("Addition of two doubles 2.5 and 3.5: " + obj.add(2.5, 3.5));
        System.out.println("Addition of three integers 2, 3, and 4: " + obj.add(2, 3, 4));
    }
}
