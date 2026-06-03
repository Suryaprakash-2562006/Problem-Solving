class Solution {
    public int subtractProductAndSum(int n) {

        int mul = 1;
        int add = 0;

        while(n > 0){
            mul = mul * (n % 10);
            add = add + (n % 10);
            n /= 10;
        }

        return mul - add;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna