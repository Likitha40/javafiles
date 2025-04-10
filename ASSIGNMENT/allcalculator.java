import java.util.Scanner;
public class allcalculator {
    public static void main(String[] args) {
        System.out.println("Likitha Lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double a = input.nextDouble();
        System.out.println("Enter b number: ");
        double b = input.nextDouble();
        Final calc = new Final( a,  b);
        calc.displayResults();
        input.close();
    }
}
