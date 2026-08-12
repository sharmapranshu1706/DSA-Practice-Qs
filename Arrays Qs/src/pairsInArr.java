class pairsInArr {
    int[] arr;
    pairsInArr(int[] arr){
        this.arr=arr;
    }
    void pairsReturn(){
        for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
        }
    }
    public static void main(String[] args){
        pairsInArr arr = new pairsInArr(new int[]{1,2,3,4,5});
        arr.pairsReturn();
    }

}
