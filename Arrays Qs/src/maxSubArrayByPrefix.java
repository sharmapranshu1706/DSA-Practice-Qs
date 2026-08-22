class maxSubArrayByPrefix {
    int[] arr;
    maxSubArrayByPrefix(int[] arr){
        this.arr = arr;
    }
    void printSubArrSum(){
        int maxSum =Integer.MIN_VALUE;
        int currSum = 0;
        int[] prefixSum =  new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                currSum = i==0 ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum subarray sum is: " + maxSum);
    }
    public static void main(String[] args){
        maxSubArrayByPrefix check = new maxSubArrayByPrefix(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        check.printSubArrSum();
    }
}
