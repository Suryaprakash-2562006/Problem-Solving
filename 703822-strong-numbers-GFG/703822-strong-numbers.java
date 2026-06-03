// User function Template for Java

class Solution {
    public int is_StrongNumber(int n) {
        // Code here
        
        int org = n;
        
        int fac  = 0;
        
        while(n > 0){
            int ld = n % 10;
            fac = fac + fact(ld);
            n /= 10;
        }
        
        if(fac == org) return 1;
        return 0;
        
    }
    
    public static int fact(int x){
        int fact = 1;
        for(int i=1;i<=x;i++){
            fact *= i;
        }
        
        return fact;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna