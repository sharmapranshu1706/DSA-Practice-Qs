class BuyAndSellStockIII {
    int[] prices;
    BuyAndSellStockIII(int[] prices) {
        this.prices = prices;
    }
    int checkMaxProfit(){
        int n = prices.length;
        if(n==0) return 0;
        int[] leftProfits = new int[n];
        int[] rightProfits = new int[n];
        int minPrice = prices[0];
        int maxPrice = prices[n-1];
        for(int i =1; i<n; i++){
            minPrice = Math.min(minPrice, prices[i]);
            leftProfits[i] = Math.max(leftProfits[i - 1], prices[i] - minPrice);
        }
        for(int i = n-2; i>=0; i--){
            maxPrice = Math.max(maxPrice, prices[i]);
            rightProfits[i] = Math.max(rightProfits[i + 1], maxPrice - prices[i]);
        }
        int maxProfit = 0;
        for(int i = 0; i<n; i++){
            maxProfit = Math.max(maxProfit, leftProfits[i] + rightProfits[i]);

        }
        return maxProfit;
    }
    public static void main(String[] args){
        BuyAndSellStockIII stock = new BuyAndSellStockIII((new int[]{3,3,5,0,0,3,1,4}));
        System.out.println(stock.checkMaxProfit());
    }
}
