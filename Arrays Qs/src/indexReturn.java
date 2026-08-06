public class indexReturn{
    public int indexValueReturn(int[] arr, int i){
        if(i>=0 && i<arr.length){
            return arr[i];
        }
        throw new IllegalArgumentException("Index out of bounds");
    }
    public static void main(String[] args){
        indexReturn n = new indexReturn();
        int sol = n.indexValueReturn(new int[]{1,2,3,4,5}, 2);
        System.out.println(sol);
    }
}