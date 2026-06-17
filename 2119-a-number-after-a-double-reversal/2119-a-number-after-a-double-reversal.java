class Solution {
    public boolean isSameAfterReversals(int num) {
        int org = num;
        int rev1 = 0;
        int rev2 = 0;

        while(num > 0){
            int ld = num % 10;
            rev1 = rev1*10+ld;
            num/=10;
        }

        while(rev1 > 0){
            int ld = rev1 % 10;
            rev2 = rev2 * 10 + ld;
            rev1 /= 10;
        }

        if(org == rev2){
            return true;
        }

        return false;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna