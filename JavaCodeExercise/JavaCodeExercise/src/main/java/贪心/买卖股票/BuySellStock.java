package 贪心.买卖股票;

public class BuySellStock {



//    public static int buySellStock(int [] stocks){
//
//        if(stocks.length==0||stocks==null){
//            return 0;
//        }
//
//        // 假设股票的价格{1，3，2，3，4，6，7，3，2}
//        int maxProft=0;
//        int minPrice=stocks[0]; // 这个是最大的
//
//        int n=stocks.length;
//
//        for (int i = 0; i <n-1 ; i++) {
//            if(maxProft>minPrice){
//                maxProft=minPrice;
//            }else {
//                maxProft=Math.max(maxProft,stocks[i]-minPrice);
//            }
//
//        }
//
//        return maxProft;
//    }
//
//    public static int buySellStock01(int [] stocks){
//        int n= stocks.length;
//
//        int maxProft=0;
//
//        int minPrice=stocks[0];
//
//
//        for(int i=0;i<n-1;i++){
//            if(stocks[i] < minPrice){
//                minPrice=stocks[i];
//            }else{
//                maxProft=Math.max(maxProft,stocks[i]-minPrice);
//            }
//
//
//        }
//
//
//
//
//        return 0;
//    }


        public static int maxProfit(int[] prices) {
            int n = prices.length;
            if (n == 0) {
                return 0;
            }

            int[][] dp = new int[n][2];
            dp[0][0] = 0;   // 表示不持有股票的状态
            dp[0][1] = -prices[0];  // 表示持有股票的状态，表示负收益

            for (int i = 1; i < n; i++) {
                // 计算 dp[i][0]，即不持有股票的情况
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);

                // 计算 dp[i][1]，即持有股票的情况
                dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);

                // 打印状态转移过程
                System.out.println("Day " + i + ":");
                System.out.println("dp[" + i + "][0] = " + dp[i][0]);
                System.out.println("dp[" + i + "][1] = " + dp[i][1]);
            }

            return dp[n - 1][0];
        }


    public static int maxProfit01(int[] prices) {
        int n = prices.length;
        if (n == 0) {
            return 0;
        }

        int[][] dp = new int[n][2];
        dp[0][0] = 0; // 不持有股票
        dp[0][1] = -prices[0]; // 持有股票

        for (int i = 1; i < n; i++) {
            // 计算不持有股票的情况
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);

            // 计算持有股票的情况
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);

/*
            dp[i - 1][1]：这表示在第 i - 1 天已经持有股票的情况下，第 i 天仍然持有股票的最大利润。这个值会保持不变，因为你没有卖出股票。

            dp[i - 1][0] - prices[i]：这表示在第 i - 1 天不持有股票的情况下，第 i 天买入股票的最大利润。
                                       dp[i - 1][0] 表示在第 i - 1 天不持有股票时的最大利润，减去 prices[i] 就是在第 i 天买入股票的负收益。
*/
        }

        return dp[n - 1][0];
    }


/*
    在动态规划中，dp[i][0] 表示第 i 天不持有股票时的最大利润，dp[i][1] 表示第 i 天持有股票时的最大利润。
    对于 dp[i][0]，可以分为两种情况：

    前一天也不持有股票，即 dp[i - 1][0]。
    前一天持有股票，今天卖出，即 dp[i - 1][1] + prices[i]。
    因此，dp[i][0] 取这两种情况的较大值。
    对于 dp[i][1]，也可以分为两种情况：

    前一天也持有股票，即 dp[i - 1][1]。
    今天买入股票，即 -prices[i]（因为买入股票是负收益）。
    因此，dp[i][1] 取这两种情况的较大值。

    通过不断更新 dp 数组，我们可以得到每一天的不同状态下的最大利润。最终返回 dp[n - 1][0]，即最后一天不持有股票时的最大利润。这样就解决了股票买卖问题，找到了在给定价格序列中可以获取的最大利润。
*/

    public static void main(String[] args) {
            int[] prices = {7, 1, 5, 3, 6, 4};
            System.out.println(maxProfit(prices));
        }
    }



