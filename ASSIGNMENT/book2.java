public class book2 { 
    public static void main(String[]args) {
       System.out.println("Likitha Lekhya");
       System.out.println("CSE-C");
       System.out.println("AV.SC.U4CSE24240");
       Book book_one = new Book("The Magic of the lost Story", "Sudha Murthy", 2022);
       Book book_two = new Book("Three thousand stiches", "Sudha Murthy", 2021);
       System.out.println("Book one details: ");
       book_one.displayDetails();
       System.out.println("Book two details: ");
       book_two.displayDetails();
      }
}