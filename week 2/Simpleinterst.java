import java.util.Scanner;

public class Simpleinterst{
    public static void main(String[] args) {
        int p,t,r,Simpleinterst;
        Scanner num = new Scanner(System.in);

        System.out.println("enter the value of p");
        p = num.nextInt();
        
        System.out.println("Enter the value of t");
        t = num.nextInt();

        System.out.println("enter the value of r");
        r = num.nextInt();
        Simpleinterst = (p * t *r)/100;

        System.out.println("Simpleinterst: " + Simpleinterst);
    }
}