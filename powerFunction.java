public class Solution {
	public int pow(int x, int n, int d) {
	   
	if (n == 0);

    long a = x;
    long ans = 1L;
    
    while (n > 0) {
        
        if (n % 2 == 1) {
            ans *= a;
            ans %= d;
        }
        
        a *= a;
        a %= d;
        n = n >> 1;
    }
    
    ans = (ans + d) % d;
    
    return (int) ans;
    
	}
}
