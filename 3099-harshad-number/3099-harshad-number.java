class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int ans = -1;
        int sum = 0;
        int org = x;

        while(x > 0){
            int ld = x % 10;
            sum += ld;
            x /= 10;
        }

        if(org % sum == 0){
            ans = sum;
        }

        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna