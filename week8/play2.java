interface Playable {
    abstract void play();
}
class Football implements Playable {
    public void play() {
        System.out.println("some people play football in the Ground.");
    }
}
class Volleyball implements Playable {
    public void play() {
        System.out.println("some people play volleyball in the Stadium.");
    }
}
class Basketball implements Playable {
    public void play() {
        System.out.println("some people play basket ball in the Rain.");
    }
}
public class play2 {
    public static void main(String[]args) {
        System.out.println("Likitha lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        Playable f = new Football();
        Playable v = new Volleyball();
        Playable b = new Basketball();
        f.play();
        v.play();
        b.play();
    }
}
