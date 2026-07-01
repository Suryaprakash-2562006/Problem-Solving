class Solution {
    public boolean isValid(String s) {

        while(true){
            if(s.contains("()")){
                s = s.replace("()" , "");
            }
            else if(s.contains("{}")){
                s = s.replace("{}","");
            }
            else if(s.contains("[]")){
                s = s.replace("[]","");
            }
            else{
                return s.isEmpty();
            }
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna