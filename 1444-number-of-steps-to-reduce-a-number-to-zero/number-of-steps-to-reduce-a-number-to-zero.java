class Solution {
    public int numberOfSteps(int num) {
        if(num == 0){
            return 0;
        }
        int ans = steps(num)-1;
        return ans;
    }
    static int steps(int num){
        if(num==0){
            return 0;
        }

        int count = 0;

        if(num%2==0){
            count++;
        }else{
            num--;
            count+=2;
        }
        return steps(num/2)+count;
    }
}