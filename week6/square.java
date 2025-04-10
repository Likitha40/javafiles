public class square {
    public double calculatearea(double s) {
        return s*s;
    } 
    public int calculatearea(int l, int b) {
        return l*b;
    }
}
class circle extends square {
    public double calculatearea(double s) {
        return (3.14*s*s);
    }
}