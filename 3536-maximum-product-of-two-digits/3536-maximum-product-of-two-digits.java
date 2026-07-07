class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        String str = "";

        while(n > 0){
            int ld = n % 10;
            str = ld + str;
            n /= 10;
        }

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                int prod = (str.charAt(i) - '0') * (str.charAt(j) - '0');
                if(prod > max) max = prod;
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna