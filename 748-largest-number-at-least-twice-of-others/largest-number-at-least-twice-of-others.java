class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int idx = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                secMax = max;
                max = nums[i];
                idx = i;
            }else if(nums[i]>secMax){
                secMax = nums[i];
            }
        }

        if(secMax*2 <= max){
            return idx;
        }
        return -1;
    }
}