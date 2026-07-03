class Solution {
    public String toLowerCase(String s) {

        String str = "";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch >='A' && ch<='Z'){
                ch = (char)(ch + 32);
            }

            str += ch;
        }

        return str;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna