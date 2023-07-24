class Solution {
        
        private int queens(int[] board, int line) {
        if (line < board.length) {
            int solutions = 0;
            for (int i = 0; i < board.length; i++) {
                boolean invalid = false;
                for (int j = 0; j < line && !invalid; j++) {
                    invalid = Math.abs(line - j) == Math.abs(board[j] - i) || board[j] == i;
                }
                if (!invalid) {
                    board[line] = i;
                    solutions += queens(board, line + 1);
                }
            }
            return solutions;
        } else {
            return 1;
        }
    }

    public int totalNQueens(int n) {
        return queens(new int[n], 0);
    }
}