package 贪心.任务分配;

import java.util.PriorityQueue;
//飞机降落：有n架飞机需要降落在同一跑道上，每架飞机需要一个特定位置，问如何安排飞机的降落顺序，使得所有飞机都能够安全降落？
public class TaskAssignment {
    public static class Task {
        int taskId;
        int priority;

        public Task(int taskId, int priority) {
            this.taskId = taskId;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        int n = 10; // 假设有10个任务
        int[] priorities = { 5, 3, 8, 2, 7, 1, 6, 4, 9, 3 }; // 每个任务的优先级
        // 对数组进行排序然后加上优先级

        PriorityQueue<Task> maxHeap = new PriorityQueue<>((t1, t2) -> t2.priority - t1.priority);

        // 将任务添加到优先队列中
        for (int i = 0; i < n; i++) {
            maxHeap.add(new Task(i, priorities[i]));

        }
        // 这个贪心的策略是小的飞机先飞

        // 分配任务
        int timeLimit = 9; // 限定的时间
        int totalTasksCompleted = 0;
        while (!maxHeap.isEmpty() && timeLimit > 0) {
            Task task = maxHeap.poll();
            if (timeLimit >= task.priority) {
                System.out.println("完成任务 " + task.taskId + "（优先级：" + task.priority + "）");
                timeLimit -= task.priority;
                totalTasksCompleted++;
            }
        }

        System.out.println("总共完成了 " + totalTasksCompleted + " 个任务");
    }
}
