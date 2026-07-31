package LeetCode;

import java.util.Scanner;

public class ContainerMostWater {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of columns : ");
        int col = sc.nextInt();
        int []arr= new int[col];

        // Array
        for(int i = 0; i < col; i++){
            System.out.println("Enter the height of column "+i+1);
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
}
