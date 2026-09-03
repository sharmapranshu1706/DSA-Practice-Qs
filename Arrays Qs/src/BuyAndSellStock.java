class BuyAndSellStock {
    int[] prices;
    BuyAndSellStock(int[] prices){
        this.prices = prices;
    }
    int checkMaxProfit(){
        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            minBuyPrice = Math.min(minBuyPrice, price);
            maxProfit = Math.max(maxProfit, price - minBuyPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args){
        BuyAndSellStock stock = new BuyAndSellStock(new int[] {7,1,5,3,6,4});
        System.out.println(stock.checkMaxProfit());
    }
}
