class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char str = s.charAt(i);

            if(str >= 'a' && str <= 'z'){
                sb.append(str);
            }
            else if(str == '#'){
                sb.append(sb);
            }
            else if(str == '%'){
                sb.reverse();
            }
            else if(str == '*'){
            if(sb.length() > 0){
            sb.deleteCharAt(sb.length() - 1);
    }
}
        }
        return sb.toString();
        
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna