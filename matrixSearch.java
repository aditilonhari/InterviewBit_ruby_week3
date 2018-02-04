public class Solution {
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	
	    int a_len = a.get(0).size();
	    int i = 0, j = a_len-1;

	    while( i < a.size() && j >= 0){
	        if(a.get(i).get(j) == b)
	            return 1;
	        
	        if (a.get(i).get(j) > b)
	            j--;
	        else
	            i++;
	    }
	    
	    return 0;
	}
	
}
