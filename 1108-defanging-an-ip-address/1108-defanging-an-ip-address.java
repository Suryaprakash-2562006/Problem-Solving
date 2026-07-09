class Solution {
    public String defangIPaddr(String address) {

        // String str = "";

        // for(int i=0;i<address.length();i++){
        //     if(address.charAt(i) == 46){
        //         str = str + "[.]";
        //     }
        //     else str = str + address.charAt(i);
        // }

        // return str;

        //return address.replace(".","[.]");


        StringBuilder sb = new StringBuilder();

for (int i = 0; i < address.length(); i++) {
    if (address.charAt(i) == '.') {
        sb.append("[.]");
    } else {
        sb.append(address.charAt(i));
    }
}

return sb.toString();
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna