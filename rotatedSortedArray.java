public class Solution {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> a, int b) {
	    
	    if (a == null || a.size() == 0)
	        return 0;
        
        if (a.size() < 2)
            return a.get(0);

	    int N = a.size();    
	    int low = 0, high = N -1;
	    
	    while(low <= high){
	        int mid = (low+high)/2;
	        
	        if(a.get(mid) == b)
	            return mid;
	        int next = (mid+1)%N;     
	        if(b > a.get(mid) && b >= a.get(next))
	            low = mid +1;
	        else
	            high = mid -1;
	    }
	    return -1;
	}
}
