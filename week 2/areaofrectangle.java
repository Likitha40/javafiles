import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        int l, b, Areaofrectangle;
        Scanner measurement = new Scanner(System.in);

        System.out.println("enter the value of length");
        l = measurement.nextInt();
        
        System.out.println("Enter the value of breadth");
        b = measurement.nextInt();

        Areaofrectangle = l * b;

        System.out.println("Areaofrectangle: " + Areaofrectangle);
    }
}