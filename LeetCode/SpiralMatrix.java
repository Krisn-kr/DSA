package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    public static List<Integer>SPIRALMATRIX (int [][]){
        ArrayList<Integer> lst = new ArrayList<>();
        int top = 0, left = 0;
        int bottom = n-1, right = n-1;

        while (top > bottom || right > left) {
            for(int i = top ; i < right;i++){
                lst.add(null);

            }
        }
        return lst;

    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size for a sqaure amtrix : ");
    int size = sc.nextInt();
    System.out.println("Enter the elements for "+size+" X "+size+" Matrix");
    int r =0;
    int col = 0;
    int [][] matrix = new int[size][size];
    while(r <size){
        while (col<size) {
            matrix[r][col] = sc.nextInt();
            col++;
        }
        col = 0;
        r++;
    }
    }
}
