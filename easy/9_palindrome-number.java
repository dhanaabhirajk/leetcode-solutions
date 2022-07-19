/*
 * https://leetcode.com/problems/palindrome-number/
 */

class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,temp = x,rem;
        while(temp>0){
            rem = temp%10;
            sum = 10*sum+rem;
            temp /= 10;
        }
        if(sum==x){
            return true;
        }else{
            return false;
        }
    }
}
