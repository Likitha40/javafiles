import java.util.Scanner;
   public class fibonaccisequence {
       public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);       
       System.out.println("Enter the no of terms:");
       int n=scanner.nextInt();
       int a=0,b=1;
       System.out.println("Fibonacci sequence");
       for (int i=1;i<=n;i++){ 
           System.out.println(a+" ");
           int nextTerm =a+b;
           a=b;
           b=nextTerm;
       }
       scanner.close();
   }
}
