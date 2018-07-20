
//思路：以为都是小写字母   构建一个26长度的二位数组  出现一次 数组对应位置的数字++ 最后去寻找最小的下标  

class Solution {
    public int firstUniqChar(String s) {
        int[][] num = new int[26][2];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            num[c - 'a'][0] += 1; //存储对饮字符串出现的次数
            num[c - 'a'][1] = i; //存储下标
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i][0] == 1) {
                if(num[i][1] < min){
                 min =num[i][1];
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1:min;
    }

}