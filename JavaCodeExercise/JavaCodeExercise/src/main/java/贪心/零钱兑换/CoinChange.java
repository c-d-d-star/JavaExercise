package 贪心.零钱兑换;

import java.util.Arrays;

public class CoinChange {


    public static int coinChange(int []coins,int amount){

        Arrays.sort(coins);

        int count=0;
        int index=coins.length-1;// 这个表示的是数组下表为最后的一个位置
        while(amount>0&&index>0){

            int coin = coins[index];// 选择最大的硬币

            int maxCoins = amount / coin;  // 需要最大的几个硬币才可以

            amount -= maxCoins * coin;  // 剩下的amount是多少

            count += maxCoins;  // 计算一下我所需要的要的最大的硬币是怎么样的

            index--; // 换一个硬币来进行计算
        }
        return amount == 0 ? count : -1;
        // 这个amount返回的就是贪心的方式
        // amount如果能够被整除的话，那么就是返回的是0，否则就是-1
    }
}
