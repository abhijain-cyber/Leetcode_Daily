class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = left(nums,target);
        arr[1] = right(nums,target);

        return arr;
    }
    static int left(int nums[], int target){

        int left = 0;
        int right = nums.length-1;

        int ans = -1;

        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid] == target){
                ans = mid;
                right = mid-1;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }

    static int right(int nums[], int target){
        int left = 0;
        int right = nums.length-1;

        int ans = -1;

        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid] == target){
                ans = mid;
                left = mid+1;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}