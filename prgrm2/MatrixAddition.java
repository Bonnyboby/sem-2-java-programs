import java.util.Scanner;

class MatrixAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows, cols;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        int A[][] = new int[rows][cols];
        int B[][] = new int[rows][cols];
        int Sum[][] = new int[rows][cols];

        System.out.println("Enter elements of Matrix A:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix B:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                Sum[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Sum of matrices:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(Sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

