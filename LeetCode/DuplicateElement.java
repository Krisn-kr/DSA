package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElement {

    // method to find the duplicate element from the array

    // Brute Force approach
    // public static boolean Duplicate(int[] nums){
    //     for(int i = 0; i< nums.length; i++){
    //         for(int j = i+1; j < nums.length ; j++){
    //             if(nums[i] == nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }


    // HashSet 
    // public static boolean Duplicate(int[]nums){
    //     // Creating a hashSet ------> stores only single value (no pairing ), no duplicates allowed
    //     HashSet<Integer> set = new HashSet<>();
    //     // Traversing through the array
    //     for(int i = 0 ; i < nums.length ; i++){
    //         // Cheking if the value is present in the HashSet or not
    //         if(set.contains(nums[i])){
    //             return true;
    //         }
    //         // pushing the value to HashSet
    //         set.add(nums[i]);
    //     }
    //     return false;
    // }

    // HashMap : 
    public static boolean Duplicate(int[]nums){
        // HashMap : Enhanced for loop
        HashMap<Integer,Integer> map = new HashMap<>();
        // int → Each element in the array is an integer.
        // num → Temporary variable that stores one element at a time.
        // nums → The array being traversed.
        for(int num: nums){
            if(map.containsKey(num)){
                return true;
            }
            // Just to check if the set contains a Duplicate Value or not
            map.put(num, 1);    
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
