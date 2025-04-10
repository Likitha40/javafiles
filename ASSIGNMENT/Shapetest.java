public class Shapetest {
    public static void main(String[]args) {
        System.out.println("Likitha Lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        triangle t = new triangle(4,5);
        circle c = new circle(2);
        rectangle r = new rectangle(2,4);
        System.out.println("Area of a Triangle is: " + t.area());
        System.out.println("Area of a Circle is: " + c.area());
        System.out.println("Area of a Rectangle is: " + r.area());
    }
}
