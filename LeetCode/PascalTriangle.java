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
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("PASCAL TRIANGLE\nEnter the rows and column number to get the element as tha position : ");
    System.out.print("\nEnter the row no : ");
    int r = sc.nextInt();

    System.out.print("\nEnter the column number : ");
    int c = sc.nextInt();

    System.out.println(FindElement(r,c));


    sc.close();
    }
}
