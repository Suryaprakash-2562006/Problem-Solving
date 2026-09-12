class Solution {
    public int lastStoneWeight(int[] stones) {
        while(stones.length > 1){
            if(stones.length != 1){
                Arrays.sort(stones);
                int x = stones[stones.length-2];
                int y = stones[stones.length-1];
                if(x==y){
                    int[] ne = new int[stones.length - 2];
                    for (int j = 0;j < ne.length;j++){
                        ne[j] = stones[j];
                    }
                    stones = ne;
                }
                else if(x != y){
                    int[] n = new int[stones.length - 1];
                    for (int k = 0;k < stones.length - 2;k++){
                        n[k] = stones[k];
                    }
                    n[n.length - 1] = y - x;
                    stones = n;
                }
            }
        }
        if(stones.length == 0) return 0;
        return stones[0];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna