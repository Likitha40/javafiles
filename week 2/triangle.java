import java.util.Scanner;
public class triangle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("a: ");
        double a = input.nextDouble();
        System.out.println("b: ");
        double b = input.nextDouble();
        System.out.println("c: ");
        double c = input.nextDouble();
        double s = a+b+c/2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area: " + area);
        input.close();
    }
}

