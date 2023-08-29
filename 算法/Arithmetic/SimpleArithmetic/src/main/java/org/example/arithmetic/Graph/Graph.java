package src.main.java.org.example.arithmetic.Graph;

class Vertex{
    public String label;  // 存储的值
    public boolean wasVisited;
    public Vertex(String lab){
        label=lab;
        wasVisited=false;
    }
}
//表示图的方式又很多种，有邻接矩阵的方式、邻接表的方式
public class Graph {

    private final int MAX_VERTS=20;
    private Vertex vertexList[]; // 这个中文意思是顶点
    private int adjMat[][]; // 邻接矩阵的展现
    private int nVerts; // 当前节点边的数量是多少

    public Graph() {
        vertexList= new Vertex[MAX_VERTS];
        adjMat=new int[MAX_VERTS][MAX_VERTS];
        nVerts=0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j]=0;
            }
        }

    }
    public void addVertex(String lab){
        vertexList[nVerts++]=new Vertex(lab);
    }
    public void addEdge(int start,int end){
        adjMat[start][end]=1;
        adjMat[end][start]=1;
    }
    public void displayVertex(int v){
        System.out.println(vertexList[v].label);
    }


    // 以上就是图的构造过程是怎么样的
}




// 怎么样来存储顶点的值

