package src.main.java.org.example.arithmetic.Graph;


import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public void dfsMain(int[][] matrix){
        int numNode = matrix.length;
        boolean[] visited = new boolean[numNode];
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0; i<numNode; i++){
            if(!visited[i]){ //将没访问过的节点入队
                queue.offer(i);
                while(!queue.isEmpty()){
                    int v = queue.poll(); //出队判断其是否有未访问过的连接节点，有的话入队标记为以访问
                    for(int j=0; j<numNode; j++){
                        if(matrix[v][j] == 1 && !visited[j]){
                            visited[j] = true;
                            queue.offer(j);
                        }
                    }
                }
            }
        }
    }
}
