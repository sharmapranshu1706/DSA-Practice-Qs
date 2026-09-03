class BuyAndSellStockII {
    int[] prices;
    BuyAndSellStockII(int[] prices){
        this.prices = prices;
    }
    int checkMaxProfit(){
        int maxProfit = 0;
        for(int i =1; i<prices.length; i++){
            if(prices[i] > prices[i - 1]){
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        BuyAndSellStockII stock = new BuyAndSellStockII(new int[] {7,1,5,3,6,4});
        System.out.println(stock.checkMaxProfit());
    }
}
