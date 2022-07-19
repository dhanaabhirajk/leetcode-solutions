import java.util.*;
/*
https://leetcode.com/problems/pascals-triangle/
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> row = new ArrayList<List<Integer>>();
        int sum = 0;
        for(int i = 0; i<numRows;i++){
            List<Integer> col = new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                	if(j==0){
                        col.add(1);
                    }
                    else if(j==i){
                        col.add(1);
                        
                    }else {
                    	sum = row.get(i-1).get(j-1)+row.get(i-1).get(j);
                    	col.add(j,sum);
                    }
                    
                }
            row.add(col);
        }
        return row;
    }
}
