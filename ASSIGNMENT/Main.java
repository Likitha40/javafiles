public class Main {
    public static void main(String[]args) {
        System.out.println("likitha lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        VisibilityExample obj = new VisibilityExample();
        System.out.println("public Variable: " + obj.PublicVariable());
        System.out.println("private Variable: " + obj.getprivateVariable());
        obj.publicMethod();
    }}