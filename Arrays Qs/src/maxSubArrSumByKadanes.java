import java.util.*;
class maxSubArrSumByKadanes {
    int[] arr;
    maxSubArrSumByKadanes(int[] arr){
        this.arr = arr;
    }
    // Two Pointer Approach
    int printMaxSubArrSum(){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int j : arr) {
            currSum += j;
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        maxSubArrSumByKadanes sum = new maxSubArrSumByKadanes(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(sum.printMaxSubArrSum());
    }
}
