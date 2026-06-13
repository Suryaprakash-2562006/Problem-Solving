class Solution {
    public char extraChar(String s1, String s2) {
        // code here
        
        int sum1 = 0;
        int sum2 = 0;
        
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            sum1 = sum1 + (ch - 'a');
        }
        
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            sum2 = sum2 + (ch - 'a');
        }
        
        int val = sum2 - sum1;
        
        return (char) (val + 'a');
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna