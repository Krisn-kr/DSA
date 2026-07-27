package LeetCode;

import java.util.Scanner;

public class DuplicateElement {

    // method to find the duplicate element from the array
    public static boolean Duplicate(int[] nums){

        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    return true;

                }

            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int []arr = new int[size]; // declaring the array

        // Feeding the elements for the  array 
        System.out.print("Enter "+ size +" Elements : ");
        for(int i =0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // Printing the original array
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println(); // for next line

        // calling the method duplicate
        System.out.println(Duplicate(arr));





        sc.close();
    }
}
