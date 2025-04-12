abstract class Animal {
    abstract void sound();
}
class Lion extends Animal {
    void sound() {
    System.out.println("Lion are cute");
    }
}
class Tiger extends Animal {
    void sound() {
        System.out.println("Tigers are cute");
    }
}
public class Animal2 {
    public static void main(String[]args) {
        System.out.println("Likitha Lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        Lion l = new Lion();
        l.sound();
        Tiger t = new Tiger();
        t.sound();
    }
}
