public class reverseArray {
    public void reverse(int[] arr){
        int start=0, last=arr.length-1;

        while(start<last){
            // Reverse Array Logic
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }
    public static void main(String[] args){
        reverseArray r = new reverseArray();
        int[] arr = {1,3,5,7,9};
        r.reverse(arr);

        //Print Reverse Array
        for(int n : arr){
            System.out.print(n + " ");
        }
    }
}
