/*
 * https://leetcode.com/problems/roman-to-integer/
 */

import java.util.*;
class Solution {
    public int romanToInt(String st) {
    	
    	char s[] = st.toCharArray();
        Map<Character, Integer> numbers = new HashMap<>();
        numbers.put('I',1);
        numbers.put('V',5);
        numbers.put('X',10);
        numbers.put('L',50);
        numbers.put('C',100);
        numbers.put('D',500);
        numbers.put('M',1000);
        int l = st.length();

        int result = numbers.get(s[l-1]);
        
        for(int i = l-2; i>-1;i--){
            if(numbers.get(s[i])>=numbers.get(s[i+1])){
                result+=numbers.get(s[i]);
            }
            else {
            	result-=numbers.get(s[i]);
            }
        }
        return result;
    }
}