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
	        int prev = (mid+N-1)%N;
	        if(a.get(next) <= a.get(high)){
	            if(b >= a.get(next) && b <= a.get(high))
	                low = mid +1;
	            else 
	                high = mid -1;
	        }
	        else {
	            if(b >= a.get(low) && b <= a.get(prev))
	                high = mid -1;
	            else 
	                low = mid +1; 
	        }
	    }
	    return -1;
	}
}
