class SubArray {
    int[] arr;
    SubArray(int[] arr){
        this.arr= arr;
    }
    void printSubArray(){
        for(int start = 0; start<arr.length; start++){
            // Calculate the end index of the sub array
            for(int end= start; end<arr.length; end++){
                // Print Sub Arrays
                for(int k = start; k<=end; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println(" ");
            }
        }
    }
    public static void main(String[] args){
        SubArray n = new SubArray(new int[]{1,2,3,4});
        n.printSubArray();
    }
}
