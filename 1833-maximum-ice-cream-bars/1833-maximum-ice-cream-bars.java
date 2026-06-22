class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;

        

        // while(coins > 0){
        //     int i=0;
        //     if(costs[i] < coins){
        //         coins = coins - costs[i];
        //         count++;
        //     }
        //     i++;

        // }

        for(int i=0;i<costs.length;i++){
            if(coins != 0){
                if(costs[i] <= coins){
                    coins -= costs[i];
                    count++;
                }
            }
        }

        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna