class Solution {
    public int countDigits(int num) {
        int count = 0;
        int og = num;

        while(num > 0){
            int ld = num % 10;

            if(og % ld == 0){
                count++;
            }

            num /=10;
        }

        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna