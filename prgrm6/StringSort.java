import java.util.Arrays;
import java.util.Scanner;

class StringSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();

        String[] strings = new String[n];

        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }

        Arrays.sort(strings);

        System.out.println("\nSorted strings:");

        for (int i = 0; i < n; i++) {
            System.out.println(strings[i]);
        }

        sc.close();
    }
}
