package 回溯法;

import java.util.ArrayList;
import java.util.List;

public class Backpacker0_1 {

}

class Item {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

class KnapsackBacktracking {

    private int maxWeight; // 背包的最大容量
    private int maxTotalValue; // 最大总价值
    private List<Item> items; // 物品列表
    private List<Item> bestCombination; // 最优解的组合

    public KnapsackBacktracking(int maxWeight, List<Item> items) {
        this.maxWeight = maxWeight;
        this.items = items;
        this.maxTotalValue = 0;
        this.bestCombination = new ArrayList<>();
    }

    public void solve() {
        List<Item> currentCombination = new ArrayList<>();
        backtrack(0, 0, 0, currentCombination);
    }

    private void backtrack(int currentIndex, int currentWeight, int currentValue, List<Item> currentCombination) {
        if (currentIndex == items.size()) {
            if (currentWeight <= maxWeight && currentValue > maxTotalValue) {
                maxTotalValue = currentValue;
                bestCombination = new ArrayList<>(currentCombination);
            }
            return;
        }

        Item currentItem = items.get(currentIndex);

        // 不选择当前物品
        backtrack(currentIndex + 1, currentWeight, currentValue, currentCombination);

        // 选择当前物品
        if (currentWeight + currentItem.weight <= maxWeight) {
            currentCombination.add(currentItem);
            backtrack(currentIndex + 1, currentWeight + currentItem.weight, currentValue + currentItem.value, currentCombination);
            currentCombination.remove(currentCombination.size() - 1); // 回溯，撤销当前选择
        }
    }

    public int getMaxTotalValue() {
        return maxTotalValue;
    }

    public List<Item> getBestCombination() {
        return bestCombination;
    }

    public static void main(String[] args) {
        int maxWeight = 5;
        List<Item> items = new ArrayList<>();
        items.add(new Item(2, 3));
        items.add(new Item(1, 2));
        items.add(new Item(3, 4));
        items.add(new Item(2, 2));

        KnapsackBacktracking knapsack = new KnapsackBacktracking(maxWeight, items);
        knapsack.solve();

        System.out.println("Max Total Value: " + knapsack.getMaxTotalValue());
        System.out.println("Best Combination: " + knapsack.getBestCombination());
    }
}
