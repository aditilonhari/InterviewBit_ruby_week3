public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int findCount(final List<Integer> A, int B) {
        
        if(A == null || A.size() == 0)
            return 0;
            
        int start  = findCountHelper(A,B,true);
        if (start == -1)
            return 0;
        int end = findCountHelper(A,B,false);

        return end - start +1;    
    }
    
    private int findCountHelper(List<Integer> A, int B, boolean searchFirst){
        int n = A.size();
        int low = 0, high = n-1, result = -1;
        
        while(low <= high){
            int mid = (low + high)/2;
        
            if(A.get(mid) == B){
                result = mid;
                if(searchFirst)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else if(B < A.get(mid)) high = mid -1;
            else 
                low = mid +1;
        }
        
        return result;
    }
}
