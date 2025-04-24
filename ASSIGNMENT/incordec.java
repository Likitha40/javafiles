import java.util.Scanner; 
public class incordec {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter b number: ");
        int b = input.nextInt();
        System.out.print("Enter c number: ");
        int c = input.nextInt();
        System.out.println("Likitha Lekhya");
        System.out.println("CSE-C");
        System.out.println("AV.SC.U4CSE24240");
        if (a<b) {
            if (b<c) {
                System.out.println("Increasing order");
            } else {
                System.out.println("Neither inreasing nor decreasing");
            }
        } else {
            System.out.println("Decreasing order");
        }
        input.close();
    }
}
