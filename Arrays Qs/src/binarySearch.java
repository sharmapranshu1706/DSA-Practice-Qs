public class binarySearch {
    public static int searchBinaryNumber(int[] numList, int key){
        int start = 0, end = numList.length-1;
        while(start<=end){
            //Mid Calculate
            int mid = (start + end) / 2;

            // Mid Value Check
            if(numList[mid] == key){
                return mid;
            }

            //Start to Mid Check
            if(numList[mid] < key){
                start = mid + 1;
            }

            // Mid to End Check
            else{
                end = mid - 1;
            }
        }
        //Invalid Key
        return -1;
    }
    public static void main(String[] args){
        int[] numList = {10,20,30,40,50,60,70,80};
        int key = 30;
        int result = searchBinaryNumber(numList, key);
        System.out.println("Index of " + key + " is: " + result);
    }
}
