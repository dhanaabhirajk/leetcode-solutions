/*
https://leetcode.com/problems/longest-common-prefix/
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String com_prefix = "";
        boolean equal;
        int length = strs.length;
        if(length == 0){
            return com_prefix;
        }
        if(length ==1){
            return strs[0];
        }
        try {
        	for(int i = 0; i < strs[0].length();i++){
                equal = false;
            	for(int j = 0;j<strs.length-1;j++){
                    if(strs[j].charAt(i)==strs[j+1].charAt(i)) {
                        equal =true;
                    }else{
                        return com_prefix;
                    }	
            	}
                if(equal){
                    com_prefix += Character.toString(strs[0].charAt(i));
                }
                 
                }
        }
        catch(StringIndexOutOfBoundsException e){
        	return com_prefix;
        }
        
        return com_prefix;
    }
}
