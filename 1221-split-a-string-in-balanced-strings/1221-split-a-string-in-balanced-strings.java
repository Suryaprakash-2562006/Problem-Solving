class Solution {
    public int balancedStringSplit(String s) {
        int rem = 0;
        int cn = 0;

        for(char ch:s.toCharArray()){
            if(ch == 'R')rem++;
            else rem--;

            if(rem == 0)cn++;
        }

        return cn;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna