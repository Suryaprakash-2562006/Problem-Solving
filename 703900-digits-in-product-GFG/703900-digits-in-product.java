// User function Template for Java
class Solution {
    static long countDigits(long a, long b) {
        // code here
        
        long mul = Math.abs(a * b);
        int digit = 0;
        
        while(mul > 0){
            long ld = mul % 10;
            digit++;
            mul /= 10;
            
        }
        
        return digit;
        
        
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna