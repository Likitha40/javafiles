import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ente table to be calculated: ");
        int x = input.nextInt();
        System.out.print("Enter how many times you want to multiply: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
        System.out.println("\nLikitha Lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        input.close();
    }
}
