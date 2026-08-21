class Solution {
    public int scoreOfString(String s) {
        int add = 0;
        int i=0;
        int j=i+1;
        while(j!=s.length())
        {
            int n1 = (int)s.charAt(i);
            int n2 = (int)s.charAt(j);
            add+= Math.abs(n1-n2);
            i++;
            j++;
        }
        return add;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna