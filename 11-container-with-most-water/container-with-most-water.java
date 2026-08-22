class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;

        int ptr1 = 0;
        int ptr2 = height.length-1;

        while(ptr1<ptr2){
            int level1 = height[ptr1];
            int level2 = height[ptr2];

            int product = level1<level2 ? level1*(ptr2-ptr1) : level2*(ptr2-ptr1);

            if(product>maxWater){
                maxWater = product;
            }

            if(level1<level2){
                ptr1++;
            }else{
                ptr2--;
            }
        }

        return maxWater;
    }
}