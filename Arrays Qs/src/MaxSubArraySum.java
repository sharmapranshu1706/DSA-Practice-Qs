// Brute Force Approach
class MaxSubArraySum {
    int[] arr;
    MaxSubArraySum(int[] arr) {
        this.arr = arr;
    }
    int maxSubArraySum() {
        int maxSum = Integer.MIN_VALUE;
        // Iterate through all possible starting indices of subarrays
        for(int i =0; i<arr.length; i++){
            // Iterate through all possible subarrays starting from index i
            for(int j=i; j<arr.length; j++){
                int currSum = 0;
                // Calculate sum of subarray from index i to j
                for(int k=i; k<=j; k++){
                    currSum += arr[k];
                }
                // Check if current sum is greater than max sum
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
        public static void main(String[] args) {
            int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
            MaxSubArraySum max = new MaxSubArraySum(arr);
            System.out.println(max.maxSubArraySum());
        }
}
