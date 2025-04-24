public class myclass {
    static int count = 0;
    final double pi = 3.14;
    public myclass() {
        count++;
    }
    public static void main(String[] args) {
        myclass obj1 = new myclass();
        myclass obj2 = new myclass();
        myclass obj3 = new myclass();

        System.out.println("Likitha Lekhya");
        System.out.println("CSE-C");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("count: " + count);
        System.out.println("Value of pi: " + obj1.pi); 
        System.out.println("Value of pi: "+  obj2.pi);
        System.out.println("Value of pi: " + obj3.pi);
    }
}
