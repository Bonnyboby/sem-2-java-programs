package graphics;
interface InterGraph {
    int rect(int l, int w);
    double tria(double b, double h);
    float squ(int a);
    double cir(double r);
}

public class Area implements InterGraph {
    public int rect(int l, int w) {
        return l * w;
    }

    public double tria(double b, double h) {
        return 0.5 * b * h;
    }

    public float squ(int a) {
        return a * a;
    }

    public double cir(double r) {
        return Math.PI * r * r;
    }
}
