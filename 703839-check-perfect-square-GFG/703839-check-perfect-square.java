class Solution {
    public boolean isPerfectSquare(int n) {
        // code here
        
        long start = 1;
        long end = n;
        
        while(start <= end){
            
            long mid = start + (end - start) / 2;
            
            long square = mid * mid;
            
            if(square == n){
                return true;
            }
            else if(square < n){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna