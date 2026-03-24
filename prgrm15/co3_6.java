import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {

    double radius;

    Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {

    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

public class co3_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("\nMenu");
            System.out.println("1. Calculate area and perimeter of Circle");
            System.out.println("2. Calculate area and perimeter of Rectangle");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();

                    Circle c = new Circle(r);

                    System.out.println("Area of Circle: " + c.area());
                    System.out.println("Perimeter of Circle: " + c.perimeter());
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();

                    System.out.print("Enter width: ");
                    double w = sc.nextDouble();

                    Rectangle rec = new Rectangle(l, w);

                    System.out.println("Area of Rectangle: " + rec.area());
                    System.out.println("Perimeter of Rectangle: " + rec.perimeter());
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
