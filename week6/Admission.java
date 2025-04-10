import java.util.Scanner;
public class Admission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter qualification percentage: ");
        double percentage = input.nextDouble();
        input.nextLine(); // Consume the leftover newline

        System.out.print("Enter program (UG/PG): ");
        String program = input.nextLine();

        if (program.equalsIgnoreCase("UG")) {
            if (percentage >= 60) {
                System.out.println(name + " is eligible for UG admission.");
            } else {
                System.out.println(name + " is not eligible for UG admission.");
            }
        } else if (program.equalsIgnoreCase("PG")) {
            if (percentage >= 70) {
                System.out.println(name + " is eligible for PG admission.");
            } else {
                System.out.println(name + " is not eligible for PG admission.");
            }
        } else {
            System.out.println("Invalid course entered.");
        }

        input.close();
    }
}
