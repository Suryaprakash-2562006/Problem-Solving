class Solution {
    static boolean isPrime(int n) {
        // code here
        boolean isPrime = true;
        if(n == 1) return false;
        for(int i=2;i<n;i++){
            if(n % i == 0){
                
                isPrime = false;
                break;
            }
        }
        
        return isPrime;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna