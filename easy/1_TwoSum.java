package easy;
/*
https://leetcode.com/problems/two-sum/
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        int result[] = new int[2];
        for(int i = 0; i<l;i++){
            for(int j = i+1 ;j<l;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}