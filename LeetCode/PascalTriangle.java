package LeetCode;

import java.util.Scanner;

public class PascalTriangle {

    // MEthod to find the element
    public static int FindElement(int r , int c){
        int element = 1;
        int n = r-1;
        int k = c-1;
        // Findinf nCr will result in the element
        //           1
        //         1.   1
        //       1.   2.  1
        //      1.  3    3. 1

        // for r = 3 , c = 2 =====> 3


        for(int i =0 ; i < k ; i++){
            element = element*(n-i);
            element = element/(i+1);
        }

        return element;
    }

    public static void ColumnPrint(int row){
        int ans = 1;
        System.out.print(ans+" ");

        for(int i = 1 ; i < row ; i++){
            ans = ans * (row - i);
            ans = ans/i;
            System.out.print(ans+" ");
        }  

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("PASCAL TRIANGLE\nEnter the rows and column number to get the element as tha position : ");
    System.out.print("\nEnter the row no : ");
    int r = sc.nextInt();

    System.out.print("\nEnter the column number : ");
    int c = sc.nextInt();
// Finding the element
    System.out.println(FindElement(r,c));

    System.out.print("Enter the row number to print the entire column of the pascal triangle : ");
    int row = sc.nextInt();
    // Printing the column of the pascal triangle ========
    System.out.println("Column of "+row +" :");
    ColumnPrint(row);


    sc.close();
    }
}
