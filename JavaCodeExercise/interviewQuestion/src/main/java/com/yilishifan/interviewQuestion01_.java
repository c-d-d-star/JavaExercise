package com.yilishifan;


/*
MELON有一堆精美的雨花石(数量为n，重量各异)，准备送给S和W。
        MELON希望送给俩人的雨花石重量一致，请你设计一个程序，帮MELON确认是否能将雨花石平均分配。
        甜瓜有一堆精美的雨花石(数量为n，重量各异)，准备送给S和W.甜瓜希望送给俩人的雨花石重量一致，请你设计一个程序，帮确认是否能将雨花石平均分配.
*/

import java.util.Arrays;
import java.util.Scanner;

public class interviewQuestion01_ {

        public static void main(String[] args) {
            int[] stones = { 1, 2, 3, 4, 5,1,2,3,4,5,6,7,7,8,9 }; // Replace this array with the actual weights of Yuhua stones

            if (canEvenlyDistribute(stones)) {
                System.out.println("Yes, the Yuhua stones can be evenly distributed between S and W.");
            } else {
                System.out.println("No, it is not possible to evenly distribute the Yuhua stones between S and W.");
            }
        }
        public static boolean canEvenlyDistribute(int[] stones) {
            int totalWeight = Arrays.stream(stones).sum();

            // If the total weight is not divisible by 2, it's impossible to distribute evenly
            if (totalWeight % 2 != 0) {
                return false;
            }

            // Call the recursive function to find a subset with totalWeight/2 for S   调用递归函数查找S的totalWeight/2的子集
            return findSubsetWithSum(stones, totalWeight / 2, 0);
        }

        private static boolean findSubsetWithSum(int[] stones, int targetSum, int index) {
            if (targetSum == 0) {
                return true;
            }

            if (index == stones.length) {
                return false;
            }

            // Include the current stone in the subset and check if it leads to the targetSum
            if (stones[index] <= targetSum && findSubsetWithSum(stones, targetSum - stones[index], index + 1)) {
                return true;
            }
            // Exclude the current stone and check the remaining stones
            return findSubsetWithSum(stones, targetSum, index + 1);
        }
    }

