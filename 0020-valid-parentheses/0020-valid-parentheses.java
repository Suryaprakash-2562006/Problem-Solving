class Solution {
    public boolean isValid(String s) {

        // while(true){
        //     if(s.contains("()")){
        //         s = s.replace("()" , "");
        //     }
        //     else if(s.contains("{}")){
        //         s = s.replace("{}","");
        //     }
        //     else if(s.contains("[]")){
        //         s = s.replace("[]","");
        //     }
        //     else{
        //         return s.isEmpty();
        //     }
        // }



        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(')
                    return false;

                if (ch == '}' && top != '{')
                    return false;

                if (ch == ']' && top != '[')
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
        


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna