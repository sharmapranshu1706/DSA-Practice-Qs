class RainTrapByPointer {
    int[] height;
    RainTrapByPointer(int[] height){
        this.height=height;
    }
    int returnTotalTrapWater(){
        int left=0, right=height.length-1;
        int maxLeft = Integer.MIN_VALUE;
        int maxRight = Integer.MIN_VALUE;
        int water=0;
        while(left<right){
            if(height[left] < height[right]){
                if(height[left] > maxLeft){
                    maxLeft = height[left];
                } else{
                    water += maxLeft - height[left];
                }
                left++;
            }
            else{
                if(height[right] > maxRight){
                    maxRight = height[right];
                } else{
                    water += maxRight - height[right];
                }
                right--;
            }
        }
        return water;
    }
    public static void main(String[] args){
        RainTrapByPointer obj = new RainTrapByPointer(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println(obj.returnTotalTrapWater());
    }
}
