/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        int j = 0;
        for(int i = 1; i<nums.length;i++){
            if(nums[i]!=nums[j]){
                nums[j+1] = nums[i];
                j++;
            }
        }
        return j+1;
    }
}