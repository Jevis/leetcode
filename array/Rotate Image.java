class Solution {
    public void rotate(int[][] matrix) {
    //先以右对角线为轴 上线反转 观察可知 [总-1-列][总-1-行]
        int vnum = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //如果是右对角线 退出  进行下一行
                 if(i + j == vnum){
                     break;
                 }else {
                     int tump = matrix[i][j];
                     matrix[i][j] = matrix[vnum - j][vnum - i];
                     matrix[vnum - j][vnum - i] = tump;
                 }
            }
        }
     //以中轴线为轴  上下翻转  即列不变 行[总-1-行]
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                 int tmup = matrix[i][j];
                 matrix[i][j] = matrix[vnum-i][j];
                matrix[vnum-i][j] = tmup;
            }
        }
        
    }
}