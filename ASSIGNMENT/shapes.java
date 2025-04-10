abstract class shapes {
    abstract double area();
}
class triangle extends shapes {
    public double base;
    public double height;
    public triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double area() {
        return (0.5*base*height);
    }
}
class circle extends shapes {
    public double r;
    public circle(double r) {
        this.r = r;
    }
    double area() {
        return (3.14*r*r);
    }
}
class rectangle extends shapes {
    public double l;
    public double b;
    public rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
    double area() {
        return(l*b);
    }
}