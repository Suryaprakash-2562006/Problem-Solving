class Solution {
    public String reversePrefix(String s, int k) {
        String str = "";
        if(s.length()>1){
            for(int i=k-1;i>=0;i--){
                str += s.charAt(i);
            }
            for(int i=k;i<s.length();i++){
                str += s.charAt(i);
            }
        }
        else str = s;
        return str;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna