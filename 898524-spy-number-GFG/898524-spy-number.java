class Solution {
    public boolean checkSpy(int n) {
        // code here
        int sum = 0;
        int mul = 1;
        
        while(n > 0){
            int ld = n % 10;
            sum = sum + ld;
            mul = mul * ld;
            n /= 10;
        }
        
        if(sum == mul) return true;
        
        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna