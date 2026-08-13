package LeetCode;

import java.util.Scanner;

public class SpiralMatrix {
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
        r++;
    }
    while(r <=size){
        while (col<=size) {

            int i = sc.nextInt();
            matrix[r][col] = sc.nextInt();
            col++;
            
            }
            r++;
        } 
    }
}
