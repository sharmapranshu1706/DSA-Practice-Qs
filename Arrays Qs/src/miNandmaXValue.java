public class miNandmaXValue {
    void findmiNmaXValue(int[] number) {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
//For each loop
        for (int n : number) {

            if (n > maxValue) {
                maxValue = n;
            }
            if (n < minValue) {
                minValue = n;
            }
        }
        System.out.println("Maximum value is: " + maxValue);
        System.out.println("Minimum value is: " + minValue);
    }
    public static void main(String[] args){
        int[] number = {55, 22, 33, 44, 11};
        miNandmaXValue obj = new miNandmaXValue();
        obj.findmiNmaXValue(number);
    }
}
