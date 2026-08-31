class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = -1;

        if(target<nums[0]){
            return 0;
        }
        if(target>nums[nums.length-1]){
            return nums.length;
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                ans = i;
            }else if(nums[i]<target){
                ans = i+1;
            }
        }
    return ans;
    }

}