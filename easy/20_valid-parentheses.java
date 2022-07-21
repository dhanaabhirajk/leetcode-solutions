import java.util.*;
/*
 * https://leetcode.com/problems/valid-parentheses/
 */
class Solution {
    public int getIndex(char ch ){
        char[] brackets = {'(', ')', '{', '}', '[' ,']'};
        for(int j = 0;j<6;j++){
                if(ch == brackets[j]){
                    return j;
                }
        }
        return 0;
    }
    public boolean isValid(String s) {
        boolean result = false;
        char[] brackets = {'(', ')', '{', '}', '[' ,']'};
        char bracket;
        int index,length;
        Stack<Character> stack = new Stack<Character>();
        length = s.length();
        
        for(int i = 0; i<length;i++){
            index = getIndex(s.charAt(i));
            if(index%2==0){
                stack.push(s.charAt(i));
            }
            else{
                try{
                    bracket = stack.pop();
                }catch(Exception e){
                    return false;
                }
                
                System.out.println(getIndex(bracket));
                System.out.println(index);
                if(bracket == brackets[index-1]){
                    result = true;
                }else{
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return result;
    }
}