//import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char current = board[row][col];
                if (current != '.') {
                    // Construct keys to track row, column, and 3x3 box
                    String rowKey = "row" + row + "-" + current;
                    String colKey = "col" + col + "-" + current;
                    String boxKey = "box" + (row / 3) + (col / 3) + "-" + current;

                    // Check for duplicates
                    if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
