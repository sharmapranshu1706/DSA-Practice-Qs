
public class largestNumber {
    public int findNumber(int[] number){
        int largestNum = Integer.MIN_VALUE;
        for(int n : number){
            if(n > largestNum){
                largestNum=n;
            }
        }
        return largestNum;
    }
    public static void main(String[] args){
        largestNumber num = new largestNumber();
        int[] numbers = {4, 2, 7, 1, 9, 3};
        int result = num.findNumber(numbers);
        System.out.println("The largest number is: " + result);
    }
}
