public class StockBuy {
    public static int maxProfit(int[] prices) {
        int lowestPrice = prices[0], profit = 0;
        for (int todaysPrice : prices) {
            if (todaysPrice < lowestPrice)
                lowestPrice = todaysPrice;
            profit = Math.max(profit, todaysPrice - lowestPrice);
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
    }
}
