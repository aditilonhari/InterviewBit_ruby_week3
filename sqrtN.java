public class Solution {
	public int sqrt(int a) {
	
	    if (a == 0 || a == 1)
	        return a;
	        
	     long start = 1, end = a/2 + 1;
	     while (start <= end){
	         long mid = (start + end) /2;
	        
	         if (mid*mid == a)
	            return (int)mid;
	            
	          if (mid*mid < a){
	            start = mid+1;
	          }
	          else{
	            end = mid-1;
	          }
	     }
	     return (int)end;
	}
}
