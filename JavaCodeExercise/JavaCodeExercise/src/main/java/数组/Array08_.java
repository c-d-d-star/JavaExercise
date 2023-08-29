package 数组;
//给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，并返回新数组的长度。
// 这个采用的就是双指针来进行的
public class Array08_ {



        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }

            int i = 0;  // 指向当前非重复元素应该放置的位置
            // 这个就是没有进行求和的操作了，

            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }

            return i + 1;  // 返回新数组的长度
        }

}
