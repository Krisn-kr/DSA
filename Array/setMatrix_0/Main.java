import java.util.Scanner;

public class Main {

    // Mark entire row as -1 except existing 0s
    static void markRow(int r, int[][] matrix, int c) {
        for(int j = 0; j < c; j++) {
            if(matrix[r][j] != 0) {
                matrix[r][j] = -1;
            }
        }
    }

    // Mark entire column as -1 except existing 0s
    static void markCol(int c, int[][] matrix, int r) {
        for(int i = 0; i < r; i++) {
            if(matrix[i][c] != 0) {
                matrix[i][c] = -1;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r, c;

        System.out.print("Rows: ");
        r = sc.nextInt();

        System.out.print("Columns: ");
        c = sc.nextInt();

        int[][] matrix = new int[r][c];

        // Input Matrix
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(i + " * " + j + " : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix:");

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Traverse matrix
        // If a 0 is found, mark its row and column

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {

                if(matrix[i][j] == 0) {

                    markRow(i, matrix, c);
                    markCol(j, matrix, r);

                }
            }
        }

        // Convert -1 into 0

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {

                if(matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Print Final Matrix

        System.out.println("\nFinal Matrix:");

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}