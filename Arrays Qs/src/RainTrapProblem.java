class RainTrapProblem {
    int[] heights;
    RainTrapProblem(int[] heights) {
        this.heights = heights;
    }
    int trapRainWater(){
        // Get the length of the heights array
        int n = heights.length;
        // Auxillary arrays to store the maximum height to the left and right of each index
        int[] leftMax =new int[n];
        //Auxillary arrays to store the maximum height to the right of each index
        int[] rightMax = new int[n];

        leftMax[0] = heights[0];

        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1], heights[i]);
        }

        rightMax[n-1] = heights[n - 1];

        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], heights[i]);
        }

        int totalTrapWater = 0;
        for(int i=0; i<n; i++){
            //Max water level calculate
            int waterLevel = Math.max(leftMax[i], rightMax[i]);
            // Water trapped at index i is the difference between the water level and the height at that index
            totalTrapWater += (waterLevel - heights[i]);
        }
        return totalTrapWater;
    }
    public static void main(String[] args){
        RainTrapProblem obj = new RainTrapProblem(new int[]{4,2,0,6,4,3,2});
        System.out.println(obj.trapRainWater());
    }
}
