import java.util.Scanner;
 public class celsiustofarenheit {
   public static void main(String[] args) {
   int C,F;
   Scanner num = new Scanner(System.in);
   System.out.println("enter the value of C");
   C = num.nextInt();
   F=(C*9/5)+32;
   System.out.println("farenheit is:"+F);
  }
 }