package LeetCode;

public class MaxSubArray {

    public static void maxSubArray(int[] nums){

        int maxSum = 0;

        for(int i =0; i< nums.length; i++){
            // subaaray
            for(int j = i ; j<nums.length; j++){

                int sum = 0;
                for(int k = i ;k <= j ; k++){
                    System.out.print(k+" ");
                }
                System.out.println();

            }
        }

//   return 
    }

    public void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        // System.out.println(maxSubArray(nums));
        maxSubArray(nums);
    }
    
}
