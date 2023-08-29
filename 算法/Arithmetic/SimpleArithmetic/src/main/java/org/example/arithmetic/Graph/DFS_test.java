package src.main.java.org.example.arithmetic.Graph;
import java.util.*;
public class DFS_test {
    private int V; // 顶点数
    private LinkedList<Integer>[] adj; // 邻接表

    // 构造函数
    public DFS_test(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    // 添加边
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // DFS函数，用visited记录已访问过的节点
    public void DFSUtil(int v, boolean[] visited) {
        visited[v] = true; // 标记当前节点为已访问
        System.out.print(v + " "); // 输出当前节点

        // 遍历当前节点的所有邻居节点
        Iterator<Integer> i = adj[v].listIterator();

        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) { // 如果邻居节点未被访问过，则继续递归访问
                DFSUtil(n, visited); // 递归访问邻居节点
            }
        }
    }

    // 从起始节点开始进行DFS遍历
    public void DFS(int v) {
        boolean[] visited = new boolean[V]; // 初始化visited数组为false
        DFSUtil(v, visited); // 从起始节点开始进行DFS遍历
    }

    public static void main(String[] args) {
        DFS_test g = new DFS_test(4); // 创建一个图对象，节点数为4
        g.addEdge(0, 1); // 添加边 (0,1)
        g.addEdge(0, 2); // 添加边 (0,2)
        g.addEdge(1, 2); // 添加边 (1,2)
        g.addEdge(2, 0); // 添加边 (2,0)
        g.addEdge(2, 3); // 添加边 (2,3)
        g.addEdge(3, 3); // 添加边 (3,3)
        System.out.println("从节点2开始的DFS遍历结果：");
        g.DFS(2); // 从节点2开始进行DFS遍历
    }
}

