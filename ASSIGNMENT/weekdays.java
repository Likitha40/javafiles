import java.util.Scanner;
public class weekdays {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number(1-7): " );
        int n = input.nextInt();
        String day = null;
        if (n==1) {
            day = "Monday";
        } else if (n==2) {
            day = "Tuesday";
        } else if (n==3) {
            day = "Wednesday";
        } else if (n==4) {
            day = "Thursday";
        } else if  (n==5) {
            day = "Friday";
        } else if (n==6) {
            day = "Saturday";
        } else if  (n==7) {
            day = "Sunday";
        } else {
            System.out.println("invalid number");
        }
        System.out.println("Likitha Lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        System.out.println("the weekday is: " + day );
        input.close();
    }
}
