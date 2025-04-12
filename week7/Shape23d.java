abstract class Shape3D {
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}
class Sphere extends Shape3D {
    int radius;
    Sphere(int radius) {
        this.radius = radius;
    }
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
 @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
class Cube extends Shape3D {
    int side;
    Cube(int side) {
        this.side = side;
    }
    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}
public class Shape23d {
    public static void main(String[] args) {
        Sphere s = new Sphere(2);
        System.out.println("Sphere Volume: " + s.calculateVolume());
        System.out.println("Sphere Surface Area: " + s.calculateSurfaceArea());
        Cube c = new Cube(2);
        System.out.println("Cube Volume: " + c.calculateVolume());
        System.out.println("Cube Surface Area: " + c.calculateSurfaceArea());
        System.out.println("Likitha lekhya,Roll no : 24240,CSE-C");
    }
}
