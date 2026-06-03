class Solution {
    public int reverse(int x) {

        long rev = 0;

        

       while(x != 0)
       {
            int n = x % 10;
            rev = rev * 10 + n;
            x = x / 10;
       }

       if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE){
        return 0;
       }
       return (int) rev;

        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna