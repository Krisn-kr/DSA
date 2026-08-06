package LeetCode;

import java.util.Arrays;
import java.util.Scanner;
class Soliution {
    public static int eraseOverlapInterval(int[][] intervals){
        if(intervals.length == 0){
            return 0;
        }
        int remove = 0;
        // sorting the array from the last index
        Arrays.sort(intervals,(a,b) ->Integer.compare(a[1], b[1]));
        int end = intervals[0][1]; // setting the end as the last index of the first interval
        // Traversing the array
        for(int i = 1; i< intervals.length; i++){
            // Comparing the first and the last index of the intervals
            if(end>intervals[i][0]){
                remove++;
            }
            else{
                end = intervals[i][1];
            }
        }
        return remove;
    }

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
        // Priting the intervals
        System.out.println("the iput intervals are : ");
        for(int i =0 ; i<size ; i++){
            System.out.print(intervals[i][0]+"\t"+intervals[i][1]+"\n");
        }

        // calling the function to find the to erase the overlapping intervals
        Soliution obj = new Soliution();

        System.out.println("The number of overlap intervals are : "+ obj.eraseOverlapInterval(intervals));
        
        sc.close();
    }
    
}
