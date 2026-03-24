import java.util.Scanner;

class search {

    int[] arr = new int[10];
    int count;

    public void get() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the count of array: ");
        count = sc.nextInt();

        System.out.println("Enter the array elements:");

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
    }
   
    public void itemSearch() {

        int n, flag = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element you want to search: ");
        n = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (arr[i] == n) {
                flag = 1;
                System.out.println("Element is found at position " + (i + 1));
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Element is not found");
        }
    }

    public static void main(String[] args) {

        search s1 = new search();

        s1.get();
        s1.itemSearch();
    }
}
