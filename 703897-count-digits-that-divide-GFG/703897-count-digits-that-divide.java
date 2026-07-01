class Solution {
    static int evenlyDivides(int n) {
        // code here
        
        int count = 0;
        int num = n;
        
        while(n > 0){
            int ld = n % 10;
            if(ld == 0){
                n /= 10;
                continue;
            }
            
            else if(num % ld == 0) count++;
            
            n /= 10;
        }
        
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna