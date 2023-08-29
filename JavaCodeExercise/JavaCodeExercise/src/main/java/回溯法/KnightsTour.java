package 回溯法;

public class KnightsTour {
    private int[][] chessboard;
    private int boardSize;
    private int moveCount;

    private static final int[] ROW_MOVES = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] COL_MOVES = {1, 2, 2, 1, -1, -2, -2, -1};

    public KnightsTour(int boardSize) {
        this.boardSize = boardSize;
        this.chessboard = new int[boardSize][boardSize];
        this.moveCount = 0;
    }

    public boolean solveTour(int startRow, int startCol) {
        chessboard[startRow][startCol] = ++moveCount;



        // 每一个终止条件都是不一样的
        if (moveCount == boardSize * boardSize) {
            return true; // 已经完成了全部的移动
        }

        // 这个意思是说循环遍历每一个点，下一个方向是怎么走的
        for (int i = 0; i < ROW_MOVES.length; i++) {
            int nextRow = startRow + ROW_MOVES[i];  // 下一行列怎么走
            int nextCol = startCol + COL_MOVES[i]; // 下一行行怎么走



            if (isSafeMove(nextRow, nextCol)) {
                if (solveTour(nextRow, nextCol)) {
                    return true;
                }
                // 回溯，撤销当前选择
                chessboard[nextRow][nextCol] = 0;
                moveCount--;
            }
        }

        return false;
    }

    private boolean isSafeMove(int row, int col) {
        return (row >= 0 && row < boardSize && col >= 0 && col < boardSize && chessboard[row][col] == 0);
    }

    public void printTour() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(chessboard[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int boardSize = 8;
        KnightsTour knightsTour = new KnightsTour(boardSize);
        int startRow = 0;
        int startCol = 0;

        if (knightsTour.solveTour(startRow, startCol)) {
            System.out.println("Knights Tour Solution:");
            knightsTour.printTour();
        } else {
            System.out.println("No Knights Tour Solution found!");
        }
    }
}
