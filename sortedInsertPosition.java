public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
	    if (a == null || a.size() == 0)
	        return 0;
	        
	    int start = 0, end = a.size() -1;
	    while(start <= end){
	        int mid = (start + end)/2;

	       if (b < a.get(mid))
	           end = mid -1;
	       else if (b > a.get(mid))
	           start = mid +1;
	       else
	           return mid;
	    }
	    return start;
	}
}
