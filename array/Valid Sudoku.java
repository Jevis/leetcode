import java.util.HashSet;


/**
 * 有效的数独
 * 1、需要验证每一行每一列出现的数组是否重复
 * 2、需要验证3X3的里面出现的额数字是否重复
 */

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {

            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> columnSet = new HashSet<>();
            HashSet<Character> groupSet = new HashSet();

            for (int j = 0; j < board[i].length; j++) {
                if (rowSet.contains(board[i][j])) {
                    return false;
                } else {
                    if (board[i][j] != '.') rowSet.add(board[i][j]);
                }


                if (columnSet.contains(board[j][i])) {
                    return false;
                } else {
                    if (board[j][i] != '.') columnSet.add(board[j][i]);
                }


                // 计算九宫格的行列下标
                int r = j/3+i/3*3;
                int c = (j%3+i*3) % 9;
                if(groupSet.contains(board[r][(c)])){
                    return false;
                }else{
                    if(board[r][c] != '.'){
                        groupSet.add(board[r][c]);
                    }
                }

            }
        }



        return true;
    }

}
