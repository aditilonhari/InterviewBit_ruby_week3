public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
	    if (a == null || a.size() == 0)
	        return null;
	        
	    ArrayList<Integer> result = new ArrayList<>();
	   
	    int start = searchRangeHelper(a, b, true);
	    int end = searchRangeHelper(a, b, false);
	    
	    if (start == -1 && end == -1){ 
	        result.add(-1);
	        result.add(-1);
	        return result;
	    }
	     
	    result.add(start);
	    result.add(end);
	    return result;
	}
	
	public int searchRangeHelper(List<Integer> a, int b, boolean searchFirst){
	     
	    int low = 0,high = a.size() -1;
	    int result = -1;
	    while(low <= high){
	        int mid = (low+high)/2;

	        if (a.get(mid) == b){
	            result = mid;
	            if (searchFirst)
	                high = mid -1;
	             else
	                low = mid +1;
	        }
	        else if (a.get(mid) > b)
	            high = mid -1;
	        else
	            low = mid +1;
	    }
	    return result;
	}
}
