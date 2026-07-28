package LeetCode;

import java.util.Scanner;

public class IfTheArrayIsRotatedOrNot {

    // Function
    public static boolean Rotated(int[]nums){
        int count = 0;

        for(int i =0; i< nums.length; i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                count ++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the SIze of the Array : ");
        int size = sc.nextInt();

        // Inserting the value to the array
        int [] nums = new int[size];
        System.out.print("Enter "+size+" Elements : ");

        for(int i = 0 ; i< size ; i++){
            nums[i] = sc.nextInt();
        }

        // Calling the method
        System.out.println(Rotated(nums));
        sc.close();
    }
    
}
