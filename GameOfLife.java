class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        
        // Directions for 8 neighbors
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        
        // Step 1: Compute next state and encode it into 2nd bit
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;
                
                for (int[] d : dirs) {
                    int ni = i + d[0], nj = j + d[1];
                    if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                        liveNeighbors += board[ni][nj] & 1; // check current state only
                    }
                }

                // Apply the Game of Life rules
                if ((board[i][j] & 1) == 1) { // currently live
                    if (liveNeighbors == 2 || liveNeighbors == 3) {
                        board[i][j] |= 2; // set next state to live
                    }
                } else { // currently dead
                    if (liveNeighbors == 3) {
                        board[i][j] |= 2; // set next state to live
                    }
                }
            }
        }
        
        // Step 2: Update board to next state (shift bits right)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] >>= 1; // move next state into current position
            }
        }
    }
}
