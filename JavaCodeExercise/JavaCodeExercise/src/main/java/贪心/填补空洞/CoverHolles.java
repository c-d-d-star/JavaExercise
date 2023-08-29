package 贪心.填补空洞;

public class CoverHolles {


    public static int minBuckets(int[] holes) {
        int maxHoles = 0;
        int maxSticks = 0;

        for (int i = 0; i < holes.length; i++) {
            int sticks = holes[i] + i + 1;
            if (sticks > maxSticks) {
                maxSticks = sticks;
                maxHoles = i + 1;
            }
        }

        return maxSticks;
    }

    public static void main(String[] args) {
        int[] candies = {3, 1, 5, 4, 2};
        int result = minBuckets(candies);
        System.out.println(result); // 7
    }
}

