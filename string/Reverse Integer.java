//思路: 先做一下正负判断 ，之后反转 再做越界判断
class Solution {
    public int reverse(int x) {
        StringBuffer sb = new StringBuffer();
        if(x < 0 ){
            sb.append('-');
        }
        String s = String.valueOf(Math.abs(x));
        try {
            for (int i = s.length()-1; i >= 0 ; i--) {
                sb.append(s.charAt(i));
            }
            return Integer.parseInt(sb.toString());
        }catch (Exception e){
            return  0;
        }
    }
}