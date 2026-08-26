class Solution {
    public String clearDigits(String s) {
        

        StringBuilder st = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >='0' && ch<='9') st.deleteCharAt(st.length()-1);
            else st.append(ch);
        }
        return st.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna