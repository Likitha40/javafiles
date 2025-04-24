import java.util.Scanner;
public class geometricobject2 {
    public static void main(String[]args) {
        System.out.println("likitha lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter s1: ");
        int s1 = input.nextInt();
        System.out.print("Enter s2: ");
        int s2 = input.nextInt();
        System.out.print("Enter s3: ");
        int s3 = input.nextInt();
        System.out.print("Enter color: ");
        String color = input.nextLine();
        input.nextLine();
        System.out.print("Is the triangle filled(true/false): ");
        boolean filled = input.nextBoolean();
        triangle t = new triangle(s1, s2, s3, color, filled);
        System.out.println("Triangle Details: ");
        System.out.println("Area: " + t.area());
        System.out.println("Perimeter: " + t.perimeter());
        System.out.println("Color: " + t.getcolor());
        System.out.println("Filled: " + t.getfilled());
        input.close();
    }
}