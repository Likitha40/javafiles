import java.util.Scanner;
 public class farenheittocelsius {
   public static void main(String[] args) {
   int C,F;
   Scanner num = new Scanner(System.in);
   System.out.println("enter the value of F");
   F = num.nextInt();
   C = (F - 32)* 5/9;
   System.out.println("Celsius is:"+C);
  }
 }