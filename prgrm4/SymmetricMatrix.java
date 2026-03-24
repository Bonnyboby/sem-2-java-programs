import java.util.Scanner;

class SymmetricMatrix {

    int rows, cols;
    int[][] matrix;

    SymmetricMatrix(int r, int c) {
        rows = r;
        cols = c;
        matrix = new int[rows][cols];
    }

    void readMatrix() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    void checkSymmetric() {

        boolean symmetric = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric) {
            System.out.println("This is a symmetric matrix");
        } else {
            System.out.println("This is NOT a symmetric matrix");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        SymmetricMatrix obj = new SymmetricMatrix(r, c);
        obj.readMatrix();
        obj.checkSymmetric();
    }
}

