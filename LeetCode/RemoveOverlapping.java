package LeetCode;

import java.util.Scanner;
class Soliution {

}

public class RemoveOverlapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size  = sc.nextInt();
        //array
        int [][]intervals = new int[size][2];

        // Loop for inserting the interval
        for(int i = 0; i < size ; i++){
            System.out.print("Enter the "+ (i+1) +" interval : ");

            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        sc.close();
    }
    
}
