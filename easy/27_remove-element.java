/*
 * https://leetcode.com/problems/remove-element/
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int j=0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }else{
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}