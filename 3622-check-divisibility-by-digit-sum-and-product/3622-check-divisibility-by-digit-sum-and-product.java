class Solution {
    public boolean checkDivisibility(int n) {

        int sum = 0;
        int prod = 1;
        int num = n;

        while(num > 0){
            sum += num % 10;
            prod *= num % 10;

            num /= 10;
        }

        if(n % (sum + prod) == 0) return true;

        return false;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna