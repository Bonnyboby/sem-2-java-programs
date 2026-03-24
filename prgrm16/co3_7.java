import java.util.*;

interface Bill {
    void calculate();
}

class Product implements Bill {

    int productId;
    String name;
    int quantity;
    float unitPrice;
    float total;

    Scanner sc = new Scanner(System.in);

    void getData() {

        System.out.print("Enter Product ID: ");
        productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter Unit Price: ");
        unitPrice = sc.nextFloat();
    }

    public void calculate() {
        total = quantity * unitPrice;
    }

    void display() {
        System.out.println(
                productId + "\t" +
                name + "\t" +
                quantity + "\t" +
                unitPrice + "\t" +
                total
        );
    }

    float getTotal() {
        return total;
    }
}

public class co3_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Order Number: ");
        int orderNo = sc.nextInt();

        System.out.print("Enter Number of Products: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        float netAmount = 0;

        System.out.println("\nEnter product details:\n");

        for (int i = 0; i < n; i++) {

            products[i] = new Product();

            products[i].getData();
            products[i].calculate();

            netAmount += products[i].getTotal();
        }

        System.out.println("\nOrder No: " + orderNo);
        System.out.println("Date: " + java.time.LocalDate.now());

        System.out.println("-----------------------------------");
        System.out.println("ID\tName\tQty\tPrice\tTotal");
        System.out.println("-----------------------------------");

        for (Product p : products) {
            p.display();
        }

        System.out.println("-----------------------------------");
        System.out.println("Net Amount = " + netAmount);
    }
}
