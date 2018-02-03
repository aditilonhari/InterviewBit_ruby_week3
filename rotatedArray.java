public class Solution {
	// DO NOT MODIFY THE LIST
	public int findMin(final List<Integer> a) {
	    
	    if (a == null || a.size() == 0)
	        return 0;
        
        if (a.size() < 2)
            return a.get(0);

	    int N = a.size();    
	    int low = 0, high = N -1;
	    
	    while(low <= high){
	        int mid = (low+high)/2;
	        if(a.get(low) <= a.get(high))
	            return a.get(low);
	        
	        int next = (mid+1)%N;
	        int prev = (mid+N-1)%N;
	        if((a.get(mid)<=a.get(next)) && (a.get(mid)<=a.get(prev)))
	            return a.get(mid);
	        else if(a.get(mid)<=a.get(high))
	            high = mid -1;
	        else if(a.get(mid)>=a.get(low))
	            low = mid +1;
	    }
	    return -1;
	}
}
