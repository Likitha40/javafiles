public class Shape2 {
    public static void main(String[]args) {
        System.out.println("Likitha lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        Shape r = new rectangle(3,6);
        System.out.println("The perimeter of the given Rectangle: " + r.getperimeter());
        Shape c = new circle(4);
        System.out.println("The perimeter of the given circle is: " + c.getperimeter());
        Shape t = new triangle(2,4,5);
        System.out.println("The perimeter of the given triangle: " + t.getperimeter());
    }
}