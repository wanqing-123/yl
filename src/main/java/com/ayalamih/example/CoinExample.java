package com.ayalamih.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * com.ayalamih.example
 *
 * @author ayalamih.
 * @date 1:57 PM, 13/03/2018
 * @contact 31007354@qq.com
 */
public class CoinExample {

    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("1");
        BigDecimal bigDecimal2 = new BigDecimal("3");
        System.out.println(bigDecimal1.divide(bigDecimal2, 3, RoundingMode.CEILING).toString());
    }

    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;

        int[] dp = new int[amount + 1];
        dp[0] = 0; // do not need any coin to get 0 amount
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            System.out.println("dp[i]: " + dp[i]);
        }


        for (int i = 0; i <= amount; i++) {
            for (int coin : coins) {
                if (i + coin <= amount) {
                    if (dp[i] == Integer.MAX_VALUE) {
                        dp[i + coin] = dp[i + coin];
                    } else {
                        dp[i + coin] = Math.min(dp[i + coin], dp[i] + 1);
                    }
                }
            }
        }

        if (dp[amount] >= Integer.MAX_VALUE)
            return -1;

        return dp[amount];
    }
}
