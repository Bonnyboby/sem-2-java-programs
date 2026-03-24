import graphics.Area;
public class TestGra {
    public static void main(String[] args) {
        Area g = new Area();
        System.out.println("Area of rectangle: " + g.rect(4, 5));
        System.out.println("Area of triangle: " + g.tria(3, 4.5));
        System.out.println("Area of square: " + g.squ(5));
        System.out.println("Area of circle: " + g.cir(4.5));
    }
}
