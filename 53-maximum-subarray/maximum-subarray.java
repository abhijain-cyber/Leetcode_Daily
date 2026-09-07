class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++){
            int tempSum = currSum + nums[i];

            if(nums[i] > tempSum){
                currSum = nums[i];

                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }else{
                currSum = tempSum;
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
}