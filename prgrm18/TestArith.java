import Arithmetic.*;

public class TestArith {
    public static void main(String[] args) {
        Oprtn obj = new Oprtn();
        System.out.println("Addition: " + obj.add(45, 4));
        System.out.println("Subtraction: " + obj.sub(34, 18));
        System.out.println("Multiplication: " + obj.mult(9, 4));
        System.out.println("Division: " + obj.div(45, 4));
        System.out.println("Remainder: " + obj.rem(45, 10));
    }
}
