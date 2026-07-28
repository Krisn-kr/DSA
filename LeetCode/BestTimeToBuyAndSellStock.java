package LeetCode;

import java.util.Scanner;
import java.util.Vector;

public class BestTimeToBuyAndSellStock {

    public static int BuyAndSell(Vector<Integer> nums){
        int profit = 0;

        for(int i = 1; i < nums.size(); i++){
            if(nums.get(i) > nums.get(i-1)){
                profit = profit + (nums.get(i) - nums.get(i-1));
            }    
            }
        
        return profit ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> nums = new Vector<>();
        System.out.print("Enter the number of the stock prices : ");
        int n = sc.nextInt();
        System.out.print("Enter the Price flactuation of the stock : ");
        for(int i = 0; i< n;i++){
            nums.add(sc.nextInt());
        }

        // Calling the vector
        System.out.println(BuyAndSell(nums));
        sc.close();
    }
}