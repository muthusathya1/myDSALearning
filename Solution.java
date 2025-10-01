class Solution {
    private static int SIZE = 9;
    private boolean[][] row = new boolean[SIZE][SIZE];
    private boolean[][] column = new boolean[SIZE][SIZE];
    private boolean[][] box = new boolean[SIZE][SIZE];

    public void solveSudoku(char[][] board) {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (board[r][c] != '.') {
                    int num = board[r][c] - '1';
                    row[r][num] = true;
                    column[c][num] = true;
                    box[getBoxIndex(r, c)][num] = true;
                }
            }
        }
        solveBoard(board, 0, 0); // Back Tracking from first position
    }

    private boolean solveBoard(char[][] board, int r, int c) {
        if (c == SIZE) {
            return solveBoard(board, ++r, 0); // Start from next row and first column
        }
        if (r == SIZE) {
            return true; // Finished the board;
        }
        if (board[r][c] != '.') {
            return solveBoard(board, r, ++c);
        } else {
            for (int i = 0; i < 9; i++) {  //Iterating thru numbers
                if(row[r][i]!=true && column[c][i]!=true && box[getBoxIndex(r,c)][i]!=true){ //If not present already
                    board[r][c]=(char) (i + '1');
                    row[r][i]=true;
                    column[c][i]=true;
                    box[getBoxIndex(r,c)][i]=true;
                    if(solveBoard(board,r,c+1)) return true;
                    board[r][c]='.';
                    row[r][i]=false;
                    column[c][i]=false;
                    box[getBoxIndex(r,c)][i]=false;
                }
            }
            return false;

        }

    }

    private int getBoxIndex(int r, int c) {
        return (((r / 3) * 3) + c / 3);
    }
}