class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum = 0;
        int ssum = 0;
        while(n>0){
            int ld = n % 10;
            dsum += ld;
            ssum += ld*ld;
            n/=10;
        }
        if((ssum-dsum)>=50){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna