public class Animal2 {
    public static void main(String[]args) {
        System.out.println("Likitha Lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        Animal a = new Animal();
        Herbivores h = new Herbivores();
        Carnivores c = new Carnivores();
        Omnivores o = new Omnivores();
        a.eat();
        h.eat();
        h.example("goat");
        c.eat();
        c.example("lion");
        o.eat();
        o.example("vulture");

    }
}
