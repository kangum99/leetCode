class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        
        for(int i = 0; i < len; i++) {
            int sum = 0;
            //0.. i까지 합 구하기
            for(int j = 0; j < i+1; j++) {
                sum += nums[j];
            }
            ans[i] = sum; 
        }

        return ans;
    }
}